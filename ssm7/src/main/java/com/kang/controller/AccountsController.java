package com.kang.controller;

import com.kang.biz.AccountsBiz;
import com.kang.pojo.Accounts;
import com.kang.pojo.AccountsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountsController {

    @Autowired
    private AccountsBiz accountsBiz;

    @RequestMapping(value = "/transfer",method = RequestMethod.POST)
//    @GetMapping(value = "transfer")
    public String transfer(@RequestBody Accounts[] accounts, HttpServletRequest req, HttpServletResponse resp, HttpSession session,
    @RequestHeader("Cookie") String cookie,
                           @CookieValue("JSESSIONID") String sessionId){
        System.out.println(sessionId);
        System.out.println(cookie);
        System.out.println(req);
        System.out.println(resp);
        System.out.println(session);
//        accountsBiz.transfer(from,to,amount);
        for (Accounts accounts2 : accounts){
            System.out.println(accounts2);
        }
//        System.out.println("from:"+accounts.getAname()+",amount:"+accounts.getAmount());

        return "index";
    }
    @GetMapping("/accountsForm")
    public String accountsForm(){
        return "accountsForm";
    }

    @RequestMapping(value = "/transfer2",method = RequestMethod.POST)
    public String transfer2(AccountsVo accounts){
//        accountsBiz.transfer(from,to,amount);
        for (Accounts accounts2 : accounts.getAccounts()){
            System.out.println(accounts2);
        }
//        System.out.println("from:"+accounts.getAname()+",amount:"+accounts.getAmount());

        return "index";
    }
}
