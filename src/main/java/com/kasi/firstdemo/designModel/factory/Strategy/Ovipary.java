package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-03 06:28
 * @Version:
 */
/* 卵生动物杂食：肉和草都吃 */
public class Ovipary implements Eat{
    @Override
    public void eat() {
        System.out.println("吃肉和草");
    }
}
