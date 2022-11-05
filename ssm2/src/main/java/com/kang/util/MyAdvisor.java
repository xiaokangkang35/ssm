package com.kang.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvisor {
    public void before(){
        System.out.println("before....");
    }
    public void after(){
        System.out.println("after....");
    }
    public void afterReturning(){
        System.out.println("afterReturning....");
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before ...");
        Object proceed = joinPoint.proceed();
        System.out.println("around after ...");
        return proceed;
    }
}
