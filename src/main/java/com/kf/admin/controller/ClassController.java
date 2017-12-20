package com.kf.admin.controller;

import com.kf.admin.pojo.MainClass;
import com.kf.admin.pojo.SecondClass;
import com.kf.admin.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
        ModelAndView modelAndView = new ModelAndView("classManage");
        modelAndView.addObject("Mcs",getMainClassList());
        return modelAndView;
    }
    @GetMapping("/getMainClassList")
    public List<MainClass> getMainClassList(){
        return classService.getMainClassList();
    }
    @GetMapping("/getSecondClassList")
    public List<SecondClass> getSecondClassList(String mcId){
        return classService.getSecondClassList(mcId);
    }
    @GetMapping("/deleteSecondClassByScId")
    public void deleteSecondClassByScId(String scId){
         classService.deleteSecondClassByScId(scId);
    }
    @PostMapping("/insertSecondClassByScId")
    public void insertSecondClassByScId(String scName,String mcId){
         classService.insertSecondClassByScId(scName,mcId);
    }

}
