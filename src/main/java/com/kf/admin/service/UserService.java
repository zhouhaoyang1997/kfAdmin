package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.UserMapper;
import com.kf.admin.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void addBlackList(String userId) {
        userMapper.addBlackList(userId);
    }

    public String updateUser(User user) {
        return userMapper.updateUser(user);
    }

    public PageInfo<User> getBlackList(Integer limit,Integer offset) {
        PageHelper.startPage(offset/limit+1, limit);
        //多条件查询
        List<User> list = userMapper.getBlackList();
        PageInfo<User> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    public void updateUserAttr(Integer userId,Integer attr) {
        userMapper.updateUserAttr(userId,attr);
    }
}
