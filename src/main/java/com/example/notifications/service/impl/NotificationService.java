//package com.example.notifications.service.impl;
//
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//import com.example.notifications.Notification;
//import com.example.notifications.NotificationRepository;
//
//import com.oodles.domain.AuthenticationToken;
//import com.oodles.domain.Notification;
//import com.oodles.domain.Req_UpdateNotitfication;
//import com.oodles.domain.user.User;
//import com.oodles.repository.NotificationRepository;
//import com.oodles.service.token.AuthTokenService;
//import com.oodles.util.KYCUtilities;
//import com.oodles.util.MessageUtility;
//import com.oodles.util.ObjectMap;
//
//@Service
//public class NotificationService {
//    @Autowired
//    private static NotificationRepository notificationRepository;
//    private static final Logger logger = LoggerFactory.getLogger(NotificationService.class);
//
//    public NotificationService() {
//    }
//
//    public Map<String, Object> updateUserNotification(Notitfication notitfication, User user) {
//
//        notification = save(notification);
//        if (notification == null) {
//            return KYCUtilities._errorMultipleObject(MessageUtility.getErrorMessage("NotificationNotUpdated"), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//        return KYCUtilities._successMultipleObject(ObjectMap.objectMap(notification), MessageUtility.getSuccessMessage("NotificationUpdated"));
//    }
//
//    public Notification save(Notification notification) {
//        try {
//            return notificationRepository.save(notification);
//        } catch (Exception e) {
//            logger.error("Exception occur while save Notification ", e);
//            return null;
//        }
//    }
//
//
//    public Notification findByUser(User user) {
//        try {
//            return notificationRepository.findByUser(user);
//        } catch (Exception e) {
//            logger.error("Exception occur while fetch Notification by User ", e);
//            return null;
//        }
//    }
//
//    public List<Notification> findByUser(User user, Integer limit) {
//        try {
//            return notificationRepository.userNotification(user.getUid(), new PageRequest(0, limit));
//        } catch (Exception e) {
//            logger.error("Exception occur while fetch Notification by User ", e);
//            return null;
//        }
//    }
//
//    public Notification createNotificationObject(String message, User user) {
//        return new Notification(message, new Date(), user);
//    }
//
//    public Notification findByUserAndNotificationId(User user, Integer notificationId) {
//        try {
//            return notificationRepository.findByUserAndNotificationId(user, notificationId);
//        } catch (Exception e) {
//            logger.error("Exception occur while fetch Notification by User and Notification Id ", e);
//            return null;
//        }
//    }
//
//
//        /*
//
//    @Value("${vapid.public.key}")
//    private String publicKey;
//
//    @Value("${vapid.private.key}")
//    private String privateKey;
//
//    private PushService pushService;
//    private List<Notification> notifications = new ArrayList<>();
//
////    public static Notification getNotificationById(Long id) {
////
////        Notification Notification;
////        return Notification;
////    }
//
//
////   public static Notification getNotificationById(Long id) {
////        Optional<Notification> optionalNotification = notificationRepository.findById(id);
////
////        if (optionalNotification.isPresent()) {
////            return optionalNotification.get();
////        }
////
////        throw new NotFoundException("Notification not found");
////    }
//
//    public String getPublicKey()
//    {
//        return publicKey;
//    }
//
////    public boolean isPresent()
////    {
////
////
////    }
//
//    public void subscribe(Flow.Subscription subscription) {
//    }
//
//    public void sendNotification() {
//        //method implementation
//        System.out.println("Notification's sent.");
//    }
//
//    public void unsubscribe(String endpoint) {
//    }*/
//
//}