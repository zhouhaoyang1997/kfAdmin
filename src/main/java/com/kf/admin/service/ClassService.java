package com.kf.admin.service;

import com.kf.admin.mapper.ClassMapper;
import com.kf.admin.pojo.MainClass;
import com.kf.admin.pojo.SecondClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhy
 * @create 2017-12-15 17:51
 **/
@Service
public class ClassService {
    @Autowired
    private ClassMapper classMapper;

    public List<MainClass> getMainClassList() {
        return classMapper.getMainClassList();
    }

    public List<SecondClass> getSC(){
        return classMapper.getSC();
    }

    public List<SecondClass> getSecondClassList(String mcId) {
        return classMapper.getSecondClassList(mcId);
    }

    public void deleteSecondClassByScId(String scId) {
         classMapper.deleteSecondClassByScId(scId);
    }

    public void insertSecondClassByScId(String scName,String mcId) {
        classMapper.insertSecondClassByScId(scName,mcId);
    }
}
