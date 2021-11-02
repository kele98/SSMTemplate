package com.aikele.service;

import com.aikele.aop.LogAspect;
import com.aikele.entity.User;
import com.aikele.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUser(){
       return userMapper.getAll();
    }
    @LogAspect
    public void insert(){
        userMapper.insert(new User(1,"kele123",22,"杭州"));
        userMapper.insert(new User(1,"kele456",22,"杭州"));
    }
}
