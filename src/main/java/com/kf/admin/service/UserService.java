package com.kf.admin.service;

import com.kf.admin.mapper.UserMapper;
import com.kf.admin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhy
 * @create 2017-11-03 23:20
 **/
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
