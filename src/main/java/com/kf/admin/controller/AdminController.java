package com.kf.admin.controller;

import com.kf.admin.pojo.Admin;
import com.kf.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author zhy
 * @create 2017-11-02 23:52
 **/
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @GetMapping("/login")
    public ModelAndView loginFtl(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(Admin admin,HttpServletRequest request){
        ModelAndView modelAndView;
        Admin __admin = adminService.judgeAdmin(admin);
        if(__admin==null){
            modelAndView = new ModelAndView("login").addObject("message","账号或密码错误！");
        }else{
            request.getSession().setAttribute("admin",__admin);
            modelAndView = new ModelAndView("index");
        }
        return modelAndView;
    }
    @GetMapping("/getAdminList")
    public List<Admin> getAdminList(){
        return adminService.getAdminList();
    }
    @PostMapping("/insertAdmin")
    public String insertAdmin(Admin admin){
        adminService.insertAdmin(admin);
        return "success";
    }
    @PostMapping("/deleteAdminById")
    public String deleteAdminById(Integer userId){
        adminService.deleteAdminById(userId);
        return "success";
    }
}
