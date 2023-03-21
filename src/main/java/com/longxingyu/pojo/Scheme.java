package com.longxingyu.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName scheme
 */
@Data
public class Scheme implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 充值
     */
    private Integer recharge;

    /**
     * 赠送
     */
    private Integer sent;

    private static final long serialVersionUID = 1L;
}