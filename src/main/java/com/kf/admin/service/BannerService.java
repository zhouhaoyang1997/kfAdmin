package com.kf.admin.service;

import com.kf.admin.mapper.BannerMapper;
import com.kf.admin.pojo.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhy
 * @create 2017-12-10 21:59
 **/
@Service
public class BannerService {
    @Autowired
    BannerMapper bannerMapper;
    public void alterBanner(Banner banner){
        bannerMapper.updateBanner(banner);
    }
}
