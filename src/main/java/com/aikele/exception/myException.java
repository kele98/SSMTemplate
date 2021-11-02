package com.aikele.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class myException {
    @ExceptionHandler(Exception.class)
    public String defaultException(Exception e){
        System.out.println("自定义异常"+e);
        return "index.html";
    }
}
