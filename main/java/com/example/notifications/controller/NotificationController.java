package com.example.notifications.controller;

import com.example.notifications.PushNotificationData;
import com.example.notifications.service.impl.NotificationService;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.Notification;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }
    @PostMapping("/send-notification")
    public ResponseEntity<String> sendNotification(@RequestBody Notification payload) {
        // Implement the logic to handle the notification, such as interacting with a push notification service or using web push libraries like web-push-java
        notificationService.sendNotification();
        return ResponseEntity.ok("Notification sent successfully");
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Notification> getNotificationById(@PathVariable Long id) {
//        //implement the logic to retrieve notification
//        Notification notification = NotificationService.getNotificationById(id);
//        return ResponseEntity.ok(notification);
//    }

    @PostMapping("/receive-notification")
    public ResponseEntity<String> receiveNotification(@RequestBody PushNotificationData notificationData) {
        // Process the received notification data
        // Implement the logic to handle the received notification, such as storing it in a database or triggering an action based on the notification content

        System.out.println("Received notification: " + notificationData);

        return ResponseEntity.ok("Notification received successfully");
    }

//    @PostMapping("/new-notification")
//    public ResponseEntity<Notification> createNotification(@RequestBody)
//    {
//        HttpClient httpclient = new HttpClient();
//        HttpGet httpget = new HttpGet(url);
//        HttpResponse response;
//
//
//
//        System.out.println("Notification created.");
//
//        return ;
//    }

}