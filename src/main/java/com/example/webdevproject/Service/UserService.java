package com.example.webdevproject.Service;

import com.example.webdevproject.entity.User;
import com.example.webdevproject.pojo.UserPojo;

import com.example.webdevproject.pojo.UserRegisterRequest;




public interface UserService {

    User registerUser(UserRegisterRequest request);
    User authenticateUser(String username, String password);
}



