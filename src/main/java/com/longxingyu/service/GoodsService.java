package com.longxingyu.service;

import com.longxingyu.pojo.Goods;

import java.util.List;

/**
 * {@code @Create:} 2023-02-28-9:15
 * {@code @Author:} 爱睡觉的小龙堡 ~
 * {@code @ToUser:} Be Happy EveryDay
 * --------------------------------------
 * {@code @note:}
 */

@SuppressWarnings({"all"})
public interface GoodsService {
    List<Goods> getGoods();

    List<Goods> desc();

    List<Goods> asc();

    Goods getById(Integer id);


    List<Goods> blur(String name);

    Integer collcet(Integer id, List<Integer> fid);

    Integer walk(Integer id, List<Integer> fid);

    Integer shop(Integer id, List<Integer> fid);

    Integer buy(Integer id, List<Integer> fid);

    List<Goods> classification(String name);

    List<String> getallfenlei();
}
