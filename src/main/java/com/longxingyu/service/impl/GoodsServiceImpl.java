package com.longxingyu.service.impl;

import com.longxingyu.mapper.GoodsMapper;
import com.longxingyu.pojo.Goods;
import com.longxingyu.service.GoodsService;
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
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    public List<Goods> getGoods() {
        return goodsMapper.getGoods();
    }

    public List<Goods> desc() {
        return goodsMapper.desc();
    }

    public List<Goods> asc() {
        return goodsMapper.asc();
    }

    @Override
    public Goods getById(Integer id) {
        return goodsMapper.getById(id);
    }

    public List<Goods> blur(String name) {
        return goodsMapper.blur(name);
    }

    public Integer collcet(Integer id, List<Integer> fid) {
        if (id != null) {
            return goodsMapper.collcetY(id);
        } else {
            return goodsMapper.collectN(fid);
        }
    }

    public Integer walk(Integer id, List<Integer> fid) {
        if (id != null) {
            return goodsMapper.walkY(id);
        } else {
            return goodsMapper.walkN(fid);
        }
    }

    public Integer shop(Integer id, List<Integer> fid) {
        if (id != null) {
            return goodsMapper.shopY(id);
        } else {
            return goodsMapper.shopN(fid);
        }
    }

    @Override
    public Integer buy(Integer id, List<Integer> fid) {
        if (id != null) {
            return goodsMapper.buyY(id);
        } else {
            return goodsMapper.buyN(fid);
        }
    }

    public List<Goods> classification(String name) {
        return goodsMapper.classification(name);
    }

    public List<String> getallfenlei() {
        return goodsMapper.getallfenlei();
    }
}
