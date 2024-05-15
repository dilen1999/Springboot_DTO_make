package com.example.demo.controller;

import com.example.demo.dto.UserLocationDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class UserController {
    @Autowired
    public UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUserLocation(){
        return userService.getAllUserLocation();
    }
}
