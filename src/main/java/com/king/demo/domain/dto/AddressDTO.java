package com.king.demo.domain.dto;

import com.king.demo.em.StatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by King on 2017/3/10.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDTO {


    /**
     * 主键
     */
    protected Integer id;

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
    protected String createTime;

    /**
     * 更新时间
     */
    protected String updateTime;

    private StatusEnum status;

    public String getFullAddress() {
        return this.province + "," + this.city + "," + this.county;
    }

}
