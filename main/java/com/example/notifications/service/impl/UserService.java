package com.example.notifications.service.impl;


import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public User createUser(User user) {
//        return userRepository.save(user);
//    }

//    public User getUserById(Long id) {
//        return userRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("User not found"));
//    }

    // Other service methods using the UserRepository
}