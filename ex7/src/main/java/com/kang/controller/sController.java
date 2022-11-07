package com.kang.controller;

import com.kang.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class sController {

    @RequestMapping(value = "/a",method = RequestMethod.POST)
    public String student(@RequestBody Student[] student){
//        System.out.println("name:"+student.getSname()+",age:"+student.getAge());
        for (Student student1:student){
            System.out.println(student1);
        }
        return "index";
    }

    @GetMapping("/toStudent")
    public String tostudent(){
        return "student";
    }
}
