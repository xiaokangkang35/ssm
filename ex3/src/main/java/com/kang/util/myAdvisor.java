package com.kang.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myAdvisor {
    @Before("pointCut()")
    public void before(){
        System.out.println("MyAdvisor:before()");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("MyAdvisor:after()");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("MyAdvisor:afterReturning()");
    }

    @Around("pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("MyAdvisor:around()->before");
        Object proceed = joinPoint.proceed();
        System.out.println("MyAdvisor:around()->after");
        return proceed;
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("MyAdvisor:afterThrowing()");
    }

    @Pointcut("execution(* com.kang.dao..*.*(..))")
    public void pointCut(){}
}
