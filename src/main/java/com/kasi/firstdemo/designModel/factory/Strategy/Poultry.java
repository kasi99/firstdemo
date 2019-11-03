package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-03 06:25
 * @Version:
 */
/* 家禽吃草 */
public class Poultry implements Eat{
    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
