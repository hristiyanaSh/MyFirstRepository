package com.example.notifications.controller;

import java.security.Key;

public class Subscription {
    public String endpoint;
    public nl.martijndwars.webpush.Subscription.Keys keys;

    public Subscription() {

    }

    public Subscription(String endpoint, String keys)
    {

    }
}
//public static  class Keys {
//    public String p256dh;
//    public String auth;
//    public Keys() {
//
//    }
//    public Keys (String key, String auth)
//    {
//        this.p256dh = key;
//        this.auth = auth;
//    }
//}