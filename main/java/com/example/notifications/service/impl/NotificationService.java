package com.example.notifications.service.impl;

import nl.martijndwars.webpush.PushService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.management.Notification;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.Flow;

@Service
public class NotificationService {
    private static Notification notificationRepository;

    @Value("${vapid.public.key}")
    private String publicKey;

    @Value("${vapid.private.key}")
    private String privateKey;

    private PushService pushService;
    private List<Notification> notifications = new ArrayList<>();

//    public static Notification getNotificationById(Long id) {
//
//        Notification Notification;
//        return Notification;
//    }


//   public static Notification getNotificationById(Long id) {
//        Optional<Notification> optionalNotification = notificationRepository.findById(id);
//
//        if (optionalNotification.isPresent()) {
//            return optionalNotification.get();
//        }
//
//        throw new NotFoundException("Notification not found");
//    }

    public String getPublicKey()
    {
        return publicKey;
    }

//    public boolean isPresent()
//    {
//
//
//    }

    public void subscribe(Flow.Subscription subscription) {
    }

    public void sendNotification() {
        //method implementation
        System.out.println("Notification's sent.");
    }

    public void unsubscribe(String endpoint) {
    }
}