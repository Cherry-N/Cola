package com.longxingyu.controller;

import com.longxingyu.controller.common.Result;
import com.longxingyu.pojo.Goods;
import com.longxingyu.service.GoodsService;
import com.longxingyu.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
@RequestMapping("/Goods")
@RestController
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @GetMapping( "get")
    public Result getGoods() {
        List<Goods> goods = goodsService.getGoods();
        return ResultUtil.returntResultGet(goods);
    }

    @GetMapping("/desc")
    public Result desc() {
        List<Goods> desc = goodsService.desc();
        return ResultUtil.returntResultGet(desc);
    }

    @GetMapping("/asc")
    public Result asc() {
        List<Goods> asc = goodsService.asc();
        return ResultUtil.returntResultGet(asc);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Goods byId = goodsService.getById(id);
        return ResultUtil.returntResultGet(byId);
    }

    @GetMapping("/blur/{name}")
    public Result mohu(@PathVariable String name) {
        List<Goods> blur = goodsService.blur(name);
        return ResultUtil.returntResultGet(blur);
    }

    @PutMapping("/collect")
    public Result collcet(@RequestParam(defaultValue = "") Integer id, @RequestParam(defaultValue = "") List<Integer> fid) {
        Integer collcet = goodsService.collcet(id, fid);
        return ResultUtil.returntResultPut(collcet);
    }

    @PutMapping("/walk")
    public Result walk(@RequestParam(defaultValue = "") Integer id, @RequestParam(defaultValue = "") List<Integer> fid) {
        Integer walk = goodsService.walk(id, fid);
        return ResultUtil.returntResultPut(walk);
    }

    @PutMapping("/shop")
    public Result shop(@RequestParam(defaultValue = "") Integer id, @RequestParam(defaultValue = "") List<Integer> fid) {
        Integer shop = goodsService.shop(id, fid);
        return ResultUtil.returntResultPut(shop);
    }

    @PutMapping("/buy")
    public Result buy(@RequestParam(defaultValue = "") Integer id, @RequestParam(defaultValue = "") List<Integer> fid) {
        Integer shop = goodsService.buy(id, fid);
        return ResultUtil.returntResultPut(shop);
    }

    @GetMapping("/classification/{name}")
    public Result classification(@PathVariable String name) {
        List<Goods> classification = goodsService.classification(name);
        return ResultUtil.returntResultGet(classification);
    }

    @GetMapping("/getfenlei")
    public Result getallfenlei() {
        List<String> getallfenlei = goodsService.getallfenlei();
        return ResultUtil.returntResultGet(getallfenlei);
    }
}
