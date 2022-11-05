package com.kang.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebListener;

//@WebListener
//@WebInitParam(name = "contextConfigLocation",value = "classpath:applicationContext.xml")
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ApplicationContext context = new ClassPathXmlApplicationContext(sce.getServletContext().getInitParameter("contextConfigLocation"));
        sce.getServletContext().setAttribute("context",context);
        System.out.println("this is context listener");


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }


}
