package com.app.Crud.controller;

import com.app.Crud.entity.UserEntity;
import com.app.Crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntity userEntity) {
        userService.addUser(userEntity);
        return "User added successfully";

    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userService.getUsers();
    }
}
