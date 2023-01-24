package com.example.redisPractice.repository;

import java.util.List;

import com.example.redisPractice.model.User;

public interface UserDao {

    boolean saveUser(User user);

    List<User> fetchAllUser();
    
}
