package com.example.webdevproject.Service.Impl;

import com.example.webdevproject.Service.UserService;
import com.example.webdevproject.entity.User;
import com.example.webdevproject.pojo.UserPojo;
import com.example.webdevproject.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor

public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void saveUser(UserPojo userPojo) {
        User user = new User();

        user.setName(userPojo.getName());
        user.setEmail(userPojo.getEmail());
        user.setPassword(userPojo.getPassword());
        userRepo.save(user);



    }

    @Override
    public List<User> getAllData() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> getById(Integer id) {
        return userRepo.findById(id);
    }


    @Override
    public void deleteById(Integer id) {

        User user = userRepo.findById(id).orElse(null);
        if (user != null) {
            userRepo.delete(user);
        }


    }
}
