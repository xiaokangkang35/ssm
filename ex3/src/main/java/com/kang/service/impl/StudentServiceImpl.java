package com.kang.service.impl;

import com.kang.dao.StudentDao;
import com.kang.service.StudentService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Setter
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void save() {
        studentDao.save();
    }
}
