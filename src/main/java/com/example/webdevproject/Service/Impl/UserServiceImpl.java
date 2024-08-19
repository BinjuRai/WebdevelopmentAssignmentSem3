package com.example.webdevproject.Service.Impl;

import com.example.webdevproject.Service.UserService;
import com.example.webdevproject.entity.User;
import com.example.webdevproject.pojo.UserPojo;
import com.example.webdevproject.pojo.UserRegisterRequest;
import com.example.webdevproject.repo.UserRepo;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepository;

    @Override
    public User registerUser(UserRegisterRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword()); // Encrypt this in production
        user.setRole(request.getRole());
        return userRepository.save(user);
    }

    @Override
    public User authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) { // Validate password securely
            return user;
        }
        return null;
    }
}
