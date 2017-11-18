package com.kf.admin.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kf.admin.mapper.TipMapper;
import com.kf.admin.pojo.Tip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author zhy
 * @create 2017-11-14 22:18
 **/
@Service
public class TipService {
    @Autowired
    TipMapper tipMapper;
    public PageInfo<Tip> getTipList(Integer limit,Integer offset) {
            PageHelper.startPage(offset/limit+1, limit);
            //多条件查询
            List<Tip> list = tipMapper.getTipList();
            PageInfo<Tip> pageInfo = new PageInfo<>(list);
            return pageInfo;
    }

    public void updateTip(String tipId) {
        tipMapper.updateTip(tipId);
    }
}
