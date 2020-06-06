package com.codegym.controller;

import com.codegym.model.UploadForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UploadFileController {
    @GetMapping()
    public ModelAndView getHomePage(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @GetMapping("/upload-one-file")
    public ModelAndView moveToOneFileForm(){
        ModelAndView modelAndView = new ModelAndView("upload-one-file");
        modelAndView.addObject("uploadFile", new UploadForm());
        return modelAndView;
    }
    @PostMapping("/upload-one-file")
    public ModelAndView uploadOneFile(){
        ModelAndView modelAndView = new ModelAndView("upload-one-file");
        modelAndView.addObject("uploadFile", new UploadForm());
        return modelAndView;
    }
}