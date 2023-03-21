package com.longxingyu.service.impl;

import com.longxingyu.mapper.UserMapper;
import com.longxingyu.pojo.User;
import com.longxingyu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.login(username, password);
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(Integer id, String password) {
        return userMapper.updateByPrimaryKey(id, password);
    }
}
