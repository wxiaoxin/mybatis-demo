package com.king.demo.em;

/**
 * Created by King on 2017/3/9.
 *
 * 状态枚举
 */

public enum  StatusEnum {

    DELETE(-1, "删除"), NORMAL(1, "正常");

    private Integer value;

    private String name;

    StatusEnum(Integer value, String name) {
        this.value = value;
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
