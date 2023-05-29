package com.example.notifications.controller;

import com.example.notifications.service.impl.NotificationService;

import java.util.concurrent.Flow;

public class NotificationEndpoints {
    private NotificationService notificationService;

    public NotificationEndpoints(NotificationService notificationService)
    {
        this.notificationService = notificationService;
    }

    public String getPublicKey()
    {return notificationService.getPublicKey();}

    public void Subscribe (Flow.Subscription subscription)
    {
        notificationService.subscribe(subscription);
    }
    public void unsubscribe (String endpoint)
    {
        notificationService.unsubscribe(endpoint);
    }
}
