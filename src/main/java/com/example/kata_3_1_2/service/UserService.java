package com.example.kata_3_1_2.service;

import com.example.kata_3_1_2.model.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Integer id);
}
