package com.kang.biz.impl;

import com.kang.biz.StudentBiz;
import com.kang.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentBizImpl implements StudentBiz {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save() {
        System.out.println("this is in studentBiz impl...");
        studentDao.save();
    }

    public void init(){
        System.out.println("init studentBiz...");
    }
    public void destroy(){
        System.out.println("destroy studentBiz...");
    }
}
