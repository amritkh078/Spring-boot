package com.app.Crud.service.impl;

import com.app.Crud.entity.UserEntity;
import com.app.Crud.repository.UserRepository;
import com.app.Crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }


    @Override
    public UserEntity getUser(Integer id) {
        return null;
    }


}
