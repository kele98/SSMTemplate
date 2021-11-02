package com.aikele.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private int age;
    private String address;

    public User(int id, String username, int age, String address) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.address = address;
    }
}
