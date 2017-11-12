package com.kf.admin.service;

import com.kf.admin.mapper.AdvertMapper;
import com.kf.admin.pojo.Advert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhy
 * @create 2017-11-08 19:44
 **/
@Service
public class AdvertService {
    @Autowired
    AdvertMapper advertMapper;
    public List<Advert> getAdvertList(){
        return advertMapper.getAdvertList();
    }

    public List<String> getAdvertPageList() {
        return advertMapper.getAdvertPageList();
    }

    public List<Advert> getAdvertsByPage(String page) {
        return advertMapper.getAdvertsByPage(page);
    }

    public Advert getAdvertByPositionAndPage(String page, String position) {
        return advertMapper.getAdvertByPositionAndPage(page, position);
    }
}
