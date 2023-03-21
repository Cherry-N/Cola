package com.longxingyu.service;

import com.longxingyu.pojo.User;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
public interface UserService {
    User login(String username, String password);

    int insert(User user);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKey(Integer id, String password);
}
