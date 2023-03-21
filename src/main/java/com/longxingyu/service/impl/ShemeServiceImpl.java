package com.longxingyu.service.impl;

import com.longxingyu.mapper.SchemeMapper;
import com.longxingyu.pojo.Scheme;
import com.longxingyu.pojo.User;
import com.longxingyu.service.SchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@Service
public class ShemeServiceImpl implements SchemeService {
    @Autowired
    private SchemeMapper schemeMapper;

    @Override
    public List<Scheme> getall() {
        return schemeMapper.getall();
    }

    @Override
    public Scheme selectByPrimaryKey(Integer id) {
        return schemeMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer recharge(User user) {
        return schemeMapper.recharge(user);
    }

    @Override
    public Integer updatejifen(User user) {
        return schemeMapper.updatejifen(user);
    }
}
