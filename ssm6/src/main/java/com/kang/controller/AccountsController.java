package com.kang.controller;

import com.kang.biz.AccountsBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class AccountsController {

    @Autowired
    private AccountsBiz accountsBiz;

    @RequestMapping(value = "/transfer",method = RequestMethod.GET)
//    @GetMapping(value = "transfer")
    public String transfer(){
        accountsBiz.transfer("a","b",1000);
//        System.out.println("from:"+from+",to:"+to+",amount:"+amount);
        return "index";
    }
}
