package com.kang.util;

import com.kang.dao.StudentDao;
import com.kang.dao.impl.StudentDaoImpl;

public class DynamicFactory {
    public StudentDao getStudentDao(){
        return new StudentDaoImpl();
    }
}
