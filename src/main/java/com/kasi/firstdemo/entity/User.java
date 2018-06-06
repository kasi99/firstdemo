package com.kasi.firstdemo.entity;

import lombok.Data;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-26 07:02
 * @Version:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Byte sex;
    private int age;
    private String address;
}
