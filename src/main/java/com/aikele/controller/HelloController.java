package com.aikele.controller;

import com.aikele.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public void hello(){

        userService.insert();
    }
}
