package com.app.Crud.service;

import com.app.Crud.entity.UserEntity;

import java.util.List;

public interface UserService {
    void addUser(UserEntity userEntity);

    List<UserEntity> getUsers();
}
