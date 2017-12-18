package com.kf.admin.controller;

import com.kf.admin.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author zhy
 * @create 2017-12-15 17:48
 **/
@RestController
public class ClassController {
    @Autowired
    private ClassService classService;

    @GetMapping("classManage")
    public ModelAndView classManage(){
        return new ModelAndView("classManage");
    }
}
