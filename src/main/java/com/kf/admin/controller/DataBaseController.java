package com.kf.admin.controller;

import com.github.pagehelper.PageInfo;
import com.kf.admin.pojo.DataBaseBackup;
import com.kf.admin.service.DataBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;


/**
 * @author zhy
 * @create 2017-12-21 14:17
 **/
@RestController
public class DataBaseController {
    @Autowired
    private DataBaseService dataBaseService;

    @GetMapping("/getDBList")
    public PageInfo<DataBaseBackup> getDBList(int limit,int offset){
        System.out.println(new DataBaseBackup());
        return dataBaseService.getDBList(limit,offset);
    }
    @GetMapping("/delDbByFileName")
    public void delDbByFileName(String fileName){
         dataBaseService.delDbByFileName(fileName);

    }
    @GetMapping("/addBackup")
    public void addBackup(){
        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("/Users/zhy/backup.sh");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
