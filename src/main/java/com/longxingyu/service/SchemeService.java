package com.longxingyu.service;

import com.longxingyu.pojo.Scheme;
import com.longxingyu.pojo.User;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
public interface SchemeService {
    List<Scheme> getall();

    Scheme selectByPrimaryKey(Integer id);

    Integer recharge(User user);

    Integer updatejifen(User user);
}
