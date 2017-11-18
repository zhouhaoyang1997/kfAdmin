package com.kf.admin.service;

import com.kf.admin.mapper.AdminMapper;
import com.kf.admin.pojo.Admin;
import com.kf.admin.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    }

    public Admin getAdminByUserId(int userId) {
        return adminMapper.getAdminByUserId(userId);
    }

    public Admin judgeAdmin(Admin admin) {
        System.out.println(admin);
        return adminMapper.judgeAdmin(admin);
    }

    public List<Admin> getAdminList() {
        return adminMapper.getAdminList();
    }

    public void deleteAdminById(Integer userId) {
        adminMapper.deleteAdminById(userId);
    }
}
