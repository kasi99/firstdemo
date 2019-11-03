package com.kasi.firstdemo.thread;

import lombok.Data;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 09:55
 * @Version:
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;

    public void print(){
        System.out.println("我只是打印。。。");
    }
}
