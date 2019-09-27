package com.llk.demo.service;

import com.llk.demo.dao.UserMapper;
import com.llk.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selByName(String name){

        return userMapper.selByName(name);
    }
}
