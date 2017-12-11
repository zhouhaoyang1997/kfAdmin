package com.kf.admin.mapper;

import com.kf.admin.pojo.Banner;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zhy
 * @create 2017-12-10 21:58
 **/
@Mapper
public interface BannerMapper {
    public void updateBanner(Banner banner);
}
