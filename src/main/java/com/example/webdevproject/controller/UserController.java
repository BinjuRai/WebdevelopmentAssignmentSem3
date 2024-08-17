package com.example.webdevproject.controller;

import com.example.webdevproject.pojo.UserPojo;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class UserController {
    @PostMapping("/save")
    public void save(@RequestBody UserPojo userPojo) {
        this.userService.saveData(userPojo);

    }
    @GetMapping("/get")
    public List<User> getall(){
        return this.userService.getAll();
    }


    @PostMapping("/login")
    public boolean login(@RequestBody User request){
        String username=request.getUsername();
        String password=request.getPassword();
        return userService.login(username, password);

    }

}
