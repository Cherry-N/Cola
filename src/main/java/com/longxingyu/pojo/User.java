package com.longxingyu.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @TableName user
 */
@Data
@Getter
@Setter
public class User implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 累计消费
     */
    private Double cost;

    /**
     * 累计充值
     */
    private Integer invest;

    /**
     * 积分
     */
    private Integer integral;

    private static final long serialVersionUID = 1L;
}