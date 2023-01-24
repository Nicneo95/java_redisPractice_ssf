package com.example.redisPractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.redisPractice.model.User;
import com.example.redisPractice.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDao.fetchAllUser();
    }
    
}
