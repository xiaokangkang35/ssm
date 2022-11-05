package com.kang.dao.impl;

import com.kang.dao.StudentDao;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {

    @Override
    public void save() {
        System.out.println("in studentDao impl......");
    }
}
