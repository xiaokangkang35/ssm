package com.kang.dao;

import com.kang.pojo.Student;

import java.util.List;

public interface StudentDao {
    int insert(Student student);
    int update(Student student);
    int delete(Student student);
    List<Student> findAllStudent();
    Student findStudentById(int sid);
}
