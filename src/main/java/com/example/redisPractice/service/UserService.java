package com.example.redisPractice.service;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.example.redisPractice.model.User;

@RestController
public interface UserService {

    boolean saveUser(User user);

    List<User> fetchAllUser();
    
}
