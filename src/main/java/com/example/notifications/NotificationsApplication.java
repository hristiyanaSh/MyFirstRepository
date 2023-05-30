package com.example.notifications;

import org.apache.catalina.User;
import org.jose4j.json.internal.json_simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;
import java.util.Date;

@SpringBootApplication
public class NotificationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationsApplication.class, args);
		//JSONObject file = new JSONObject();
	}

}
