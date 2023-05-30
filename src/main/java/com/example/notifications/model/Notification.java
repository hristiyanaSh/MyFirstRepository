package com.example.notifications.model;

import jakarta.persistence.Entity;
import org.apache.catalina.User;
import org.jose4j.json.internal.json_simple.JSONObject;

import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.*;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.FetchType;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "notification_table")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notification_id")
    private Long notificationId;

    @Column(name = "message")
    private String message;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user_id;
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "status")

    private boolean status;
    @Column(nullable = false)

    private String request_type;
    @Column(name = "request_type")
    private Long table_id;

    public Notification() {
    }

    public Notification(String requestType, String message, boolean status, Date time, User user) {
        this.request_type = requestType;
        this.message = message;
        this.status = status;
        this.createdAt = time;
        this.user_id = user;
    }

    public Notification(String message, LocalDateTime now, JSONObject file) {
    }

    public Long getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }
    public Long getTable_id() {
        return table_id;
    }

    public void setTable_id(Long table_id) {
        this.table_id = table_id;
    }
    public String getMessage() {
        return "On table " + table_id + "is requested " + message + " .";
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public void setTime(Date time) {
        this.createdAt = time;
    }
}