package com.king.demo.domain.dto;

import com.king.demo.domain.entity.Address;
import com.king.demo.em.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by King on 2017/3/9.
 *
 * 用户传输对象
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    /**
     * 主键
     */
    protected Long id;

    private String name;

    private Integer age;

    private Address homeAddress;

    private Address companyAddress;

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新时间
     */
    protected Date updateTime;

    private Integer status;

}
