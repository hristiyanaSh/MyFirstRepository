package com.example.notifications;

public class PushNotificationData {
    private String title;
    private String body;

    // Add more fields as per your notification data structure

    // Constructors, getters, and setters
    public PushNotificationData(String title, String body)
    {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
