package com.kang.util;

import com.kang.dao.StudentDao;
import com.kang.dao.impl.StudentDaoImpl;

public class StaticFactory {
    public static StudentDao getStudentDao(){
        return new StudentDaoImpl();
    }
}
