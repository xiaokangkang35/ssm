package com.kang.biz.impl;

import com.kang.biz.StudentBiz;
import com.kang.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope("singleton")
public class StudentBizImpl implements StudentBiz {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void save() {
        System.out.println("in studentBiz......");
        studentDao.save();
    }
    @PostConstruct
    public void init(){
        System.out.println("初始化 studentBiz...");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁 studentBiz...");
    }
}
