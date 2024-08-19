package com.example.webdevproject.controller;

import com.example.webdevproject.Service.UserService;
import com.example.webdevproject.pojo.UserPojo;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")

@RestController

public class UserController {

    @Autowired
    private UserService userService;

    // Add more user-related endpoints as needed
}
