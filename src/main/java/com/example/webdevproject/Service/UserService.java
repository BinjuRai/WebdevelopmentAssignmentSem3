package com.example.webdevproject.Service;

import com.example.webdevproject.entity.User;
import com.example.webdevproject.pojo.UserPojo;


import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(UserPojo userPojo);

    List<User> getAllData();

    Optional<User> getById(Integer id);

    void deleteById(Integer id);
}
