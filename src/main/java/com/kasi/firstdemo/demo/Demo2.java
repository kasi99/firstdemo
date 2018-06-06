package com.kasi.firstdemo.demo;

import org.springframework.stereotype.Component;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:14
 * @Version:
 */
@Component
public class Demo2 implements SpeakDemo<Demo2> {

    @Override
    public void speak() {
        System.out.println("demo2开始讲话");
    }
}
