package com.longxingyu.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @TableName goods
 */
@Data
public class Goods implements Serializable {
    /**
     * ID
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品价格
     */
    private Double price;

    /**
     * 商品描述
     */
    private String description;

    /**
     * 是否加入购物车
     */
    private Integer shopcar;

    /**
     * 是否收藏
     */
    private Integer collect;

    /**
     * 足迹
     */
    private Integer walk;

    /**
     * 商品类别
     */
    private String classification;

    /**
     * 商品图片
     */
    private String img_Url;

    private Integer buy;

}