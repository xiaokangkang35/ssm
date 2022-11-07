package com.kang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kang.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class StudentController {

//    文件上传
    @RequestMapping(value = "/test5")
    public String test5(MultipartFile[] files, HttpServletRequest req) throws  IllegalStateException,IOException {
//        System.out.println(file1);
//        System.out.println(req.getRealPath("/upload")+"\\"+file1.getOriginalFilename());
        for (MultipartFile file1:files){
            File file = new File(req.getRealPath("upload")+"\\"+file1.getOriginalFilename());
            file1.transferTo(file);
        }
        return "index";
    }


//    直接返回对象
    @RequestMapping(value = "/test4")
    @ResponseBody
    public Student test4() throws JsonProcessingException {
        Student student = new Student();
        student.setAge(16);
        student.setSid(1);
        student.setName("子康");
        student.setStatus(1);
        return student;
    }

    @RequestMapping(value = "/test3",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String test3() throws JsonProcessingException {
        Student student = new Student();
        student.setAge(16);
        student.setSid(1);
        student.setName("子康");
        student.setStatus(1);
        return new ObjectMapper().writeValueAsString(student);
    }

//    访问器
    @RequestMapping(value = "/ajax")
    public String doAjax(){
        return "ajax";
    }

//    Model
    @RequestMapping("/test2")
    public String test2(String name, Model model){
        System.out.println(name);
        model.addAttribute("username","zi");
        model.addAttribute("age","20");
        return "index";
    }

//    ModelAndView
    @RequestMapping("/test1")
    public ModelAndView test1(String name,ModelAndView modelAndView){
        System.out.println(name);
        modelAndView.addObject("username","wang");
        modelAndView.addObject("age","16");

        modelAndView.setViewName("index");
        return modelAndView;
    }
}
