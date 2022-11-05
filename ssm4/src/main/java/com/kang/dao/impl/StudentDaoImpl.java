package com.kang.dao.impl;

import com.kang.dao.StudentDao;
import com.kang.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        int count = jdbcTemplate.update("insert into student values (null , ?, ?, ?);",
                student.getSname(),student.getAge(),student.getStatus());
        return count;
    }

    @Override
    public int update(Student student) {
        int count = jdbcTemplate.update("update student set sname=?,age=?,status=? where sid=?",
                student.getSname(),student.getAge(),student.getStatus(),student.getSid());
        return count;
    }

    @Override
    public int delete(Student student) {
        int count = jdbcTemplate.update("delete from student where sid=?",student.getSid());
        return count;
    }

    @Override
    public List<Student> findAllStudent() {
        List<Student> students = jdbcTemplate.query("select * from student",new BeanPropertyRowMapper<Student>(Student.class));
        return students;
    }

    @Override
    public Student findStudentById(int sid) {
        Student student = jdbcTemplate.queryForObject("select * from student where sid=?",new BeanPropertyRowMapper<Student>(Student.class),sid);
        return student;
    }
}
