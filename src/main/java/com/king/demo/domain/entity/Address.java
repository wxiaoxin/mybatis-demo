package com.king.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by King on 2017/3/9.
 *
 * 地址
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 省份
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 县、区
     */
    private String county;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最近更新时间
     */
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;

}
