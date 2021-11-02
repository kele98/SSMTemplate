package com.aikele.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("@annotation(com.aikele.aop.LogAspect)")
    public void pt(){
    }
    @Around("pt()")
    public void logging(ProceedingJoinPoint pjp){
        try {
            System.out.println("自定义注解aop执行了");
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
