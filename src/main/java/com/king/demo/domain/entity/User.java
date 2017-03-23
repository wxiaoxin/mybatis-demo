package com.king.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by King on 2017/2/21.
 *
 * 用户实体类
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 家庭地址
     */
    private Long homeAddressId;

    private Address homeAddress;

    /**
     * 公司地址
     */
    private Long companyAddressId;

    private Address companyAddress;

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
