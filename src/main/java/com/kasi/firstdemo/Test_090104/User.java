package com.kasi.firstdemo.Test_090104;

import lombok.Data;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-01-05 04:33
 * @Version:
 */
/* User对象*/
@Data
public class User {
    private String name;
    private Integer age;
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
