package com.example.notifications;

public class NotificationResponse {
    private Long notificationId;
    private String notificationContent;
    public NotificationResponse(Long notificationId, String notificationContent) {
        this.notificationId = notificationId;
        this.notificationContent = notificationContent;
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    public String getNotificationContent() {
        return notificationContent;
    }

    public void setNotificationContent(String notificationContent) {
        this.notificationContent = notificationContent;
    }
}
