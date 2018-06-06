package com.kasi.firstdemo.demo;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:13
 * @Version:
 */

public class Demo1 implements SpeakDemo<Demo1> {
    @Override
    public void speak() {
        System.out.println("demo1开始讲话");
    }
}
