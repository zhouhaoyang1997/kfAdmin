package com.kf.admin.controller;

import com.kf.admin.pojo.User;
import com.kf.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @create 2017-11-03 23:15
 **/
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUserByName")
    public User getUserByName(String username){
        return userService.getUserByName(username);
    }
}
