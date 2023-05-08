package com.longxingyu.controller;

import com.longxingyu.controller.common.Result;
import com.longxingyu.pojo.Scheme;
import com.longxingyu.pojo.User;
import com.longxingyu.service.SchemeService;
import com.longxingyu.service.UserService;
import com.longxingyu.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~x
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@RestController
@RequestMapping("/Scheme")
public class SchemeController {

    @Autowired
    private SchemeService schemeService;

    @Autowired
    private UserService userService;

    @GetMapping()
    public Result getall() {
        List<Scheme> getall = schemeService.getall();
        return ResultUtil.returntResultGet(getall);
    }

    @GetMapping("/{id}")
    public Result selectByPrimaryKey(@PathVariable Integer id) {
        Scheme scheme = schemeService.selectByPrimaryKey(id);
        return ResultUtil.returntResultGet(scheme);
    }


    @PutMapping("/recharge/{uid}/{fid}")
    public Result recharge(@PathVariable Integer uid, @PathVariable Integer fid) {
        User user = userService.selectByPrimaryKey(uid);
        Scheme scheme = schemeService.selectByPrimaryKey(fid);
        user.setBalance(user.getBalance() + scheme.getRecharge() + scheme.getSent());
        user.setInvest(user.getInvest() + scheme.getRecharge());
        Integer recharge = schemeService.recharge(user);
        return ResultUtil.returntResultPut(recharge);
    }

    @PutMapping("/updatejifen/{id}/{integral}")
    public Result updatejifen(@PathVariable Integer id, @PathVariable Integer integral) {
        User user = userService.selectByPrimaryKey(id);
        user.setIntegral(user.getIntegral() + integral);
        Integer updatejifen = schemeService.updatejifen(user);
        return ResultUtil.returntResultPut(updatejifen);
    }
}
