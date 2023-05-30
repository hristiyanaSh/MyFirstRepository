package com.example.notifications.controller;

import com.example.notifications.NotificationResponse;
import com.example.notifications.Repository.NotificationRepository;
import com.example.notifications.model.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

   private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationController(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
    @PostMapping("/notification")
    public ResponseEntity<NotificationResponse> createNotification(@RequestBody Notification notification)
    {
        // Set the current time for the notification
        notification.setTime(new Date());

        // Save the notification entity to the database
        Notification savedNotification = (Notification) notificationRepository.save(notification);

        // Create the response object with notification ID and content
        NotificationResponse response = new NotificationResponse(savedNotification.getNotificationId(), savedNotification.getMessage());

        //return the response object in the ResponseEntity
        return ResponseEntity.ok(response);
    }

    @GetMapping("/notification/{id}")
    public ResponseEntity<NotificationResponse> getNotificationById(@PathVariable Long id)
    {
        // Retrieve the notification from the database by ID
        Optional<Notification> optionalNotification = notificationRepository.findById(id);

        if (optionalNotification.isPresent()) {
            // Create the response object with notification ID and content
            Notification notification = optionalNotification.get();
            NotificationResponse response = new NotificationResponse(notification.getNotificationId(), notification.getMessage());

            // Return the response object in the ResponseEntity
            return ResponseEntity.ok(response);
        } else {
            // Handle the case when the notification is not found
            return ResponseEntity.notFound().build();
        }
    }
}