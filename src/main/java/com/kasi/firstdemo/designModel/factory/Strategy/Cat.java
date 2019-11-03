package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-03 06:26
 * @Version:
 */
/* 猫科动物吃肉 */
public class Cat implements Eat {
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}
