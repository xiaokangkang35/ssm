package com.kang.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdviser {
    @Before("myPointcut()")
    public void before(){
        System.out.println("前置增强...");
    }
    @Pointcut("execution(* com.kang.dao..*.*(..))")
    public void myPointcut(){

    }
}
