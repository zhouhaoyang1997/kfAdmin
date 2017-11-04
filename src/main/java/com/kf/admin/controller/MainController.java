package com.kf.admin.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author zhy
 * @create 2017-09-28 19:31
 **/
@RestController
public class MainController extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("/index");
        registry.addViewController("/pushInfoManage").setViewName("/pushInfoManage");
        registry.addViewController("/ADManage").setViewName("/AdManage");
        registry.addViewController("/databaseBackup").setViewName("/databaseBackup");
        registry.addViewController("/editUserInfo").setViewName("/editUserInfo");
        registry.addViewController("/blackList").setViewName("/blackList");
        registry.addViewController("/adminsManage").setViewName("/adminsManage");
        registry.addViewController("/addNewSecondClass").setViewName("/addNewSecondClass");
    }


}
