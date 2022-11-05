package com.kang.web;

import com.kang.biz.AccountsBiz;
import com.kang.config.MyConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
//        ApplicationContext context = (ApplicationContext) req.getServletContext().getAttribute("context");
        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(req.getServletContext());
        AccountsBiz accountsBiz = context.getBean(AccountsBiz.class);
        accountsBiz.transfer("a","b",1000);
    }
}
