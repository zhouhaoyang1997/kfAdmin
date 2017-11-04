package com.kf.admin.service;

import com.kf.admin.mapper.AdminMapper;
import com.kf.admin.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhy
 * @create 2017-11-03 00:13
 **/
@Service
public class AdminService {
    @Autowired
    AdminMapper adminMapper;
    public void insertAdmin(Admin admin){
        adminMapper.insertAdmin(admin);
    };

    public Admin getAdminByUserId(int userId) {
        return adminMapper.getAdminByUserId(userId);
    }

    public Admin judgeAdmin(Admin admin) {
        return adminMapper.judgeAdmin(admin);
    }
}
