package com.kang.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(value = "/upfile")
    public String upfile(MultipartFile[] files, HttpServletRequest req, Model model) throws IOException {
        for (MultipartFile file1:files){
            File file = new File(req.getRealPath("upload")+"\\"+file1.getOriginalFilename());
            file1.transferTo(file);
            model.addAttribute("filename",file1.getOriginalFilename());
        }
        return "success";
    }

    @RequestMapping(value = "/tofile")
    public String dosuccess(){
        return "/index";
    }
}
