package com.kasi.firstdemo.entity;

import lombok.Data;

/**
 * user类
 *
 * @Author: HuangTao
 * @Date: 2018-05-26 07:02
 * @Version:
 */
@Data
public class User {
    private Long id;
    private String name;
    private int age;
    private String remark;
    private String type;
}
