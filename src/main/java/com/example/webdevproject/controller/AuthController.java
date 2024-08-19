package com.example.webdevproject.controller;

import com.example.webdevproject.Service.UserService;
import com.example.webdevproject.entity.User;
import com.example.webdevproject.pojo.UserLoginRequest;
import com.example.webdevproject.pojo.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserRegisterRequest request) {
        User user = userService.registerUser(request);
        return ResponseEntity.ok(user);
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserLoginRequest request) {
        User user = userService.authenticateUser(request.getUsername(), request.getPassword());
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.badRequest().build();
    }
}