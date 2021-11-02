package com.aikele.mapper;

import com.aikele.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> getAll();
    void insert(User user);
}
