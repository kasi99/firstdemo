package com.kasi.firstdemo.entity;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.Serializable;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-09-08 18:38
 * @Version:
 */

public enum CommonYnEnum implements IEnum{
    NO(0, "common.no"),
    /**
     * 通用枚举：1-是
     */
    YES(1, "common.yes");

    private Integer value;

    private String desc;
    CommonYnEnum(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }


    @JsonCreator
    public static CommonYnEnum newInstance(Integer value) {
        for (CommonYnEnum commonEnum : CommonYnEnum.values()) {
            if (value.equals(commonEnum.getValue())) {
                return commonEnum;
            }
        }
        return null;
    }

    @Override
    public Serializable getValue() {
        return this.value;
    }


}
