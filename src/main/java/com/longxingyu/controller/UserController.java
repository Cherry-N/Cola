package com.longxingyu.controller;

import com.longxingyu.controller.common.Result;
import com.longxingyu.pojo.User;
import com.longxingyu.service.UserService;
import com.longxingyu.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/login/{username}/{password}")
    public Result login(@PathVariable String username, @PathVariable String password) {
        User login = userService.login(username, password);
        return ResultUtil.returntResultGet(login);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody User user) {
        int insert = userService.insert(user);
        return ResultUtil.returntResultPost(insert);
    }

    @PutMapping("/update/{id}/{password}")
    public Result updateByPrimaryKey(@PathVariable Integer id, @PathVariable String password) {
        int i = userService.updateByPrimaryKey(id, password);
        return ResultUtil.returntResultPut(i);
    }
}
