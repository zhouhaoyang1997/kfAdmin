package com.kf.admin.controller;

import com.kf.admin.pojo.Advert;
import com.kf.admin.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-08 19:45
 **/
@RestController
public class AdvertController {
    @Autowired
    AdvertService advertService;
    @GetMapping("/ADManage")
    public ModelAndView adManager(String page){
        ModelAndView modelAndView = new ModelAndView("AdManage");
        modelAndView.addObject("adverts",advertService.getAdvertsByPage(page));
        return modelAndView;
    }

    @GetMapping("/getAdvertList")
    public List<Advert> getAdvertList(){
        return advertService.getAdvertList();
    }
    @GetMapping("/getAdvertPageList")
    public List<String> getAdvertPageList(){
        return advertService.getAdvertPageList();
    }
    @GetMapping("/getAdvertsByPage")
    public List<Advert> getAdvertsByPage(String page){
        return advertService.getAdvertsByPage(page);
    }

}
