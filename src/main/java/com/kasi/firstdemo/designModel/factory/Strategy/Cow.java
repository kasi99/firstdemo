package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-03 06:44
 * @Version:
 */
/* 牛 */
public class Cow extends Animal {
    public static void main(String[] args) {
        Animal cow = new Cow();
        /* 牛属于家禽 */
        cow.setEat(new Poultry());
        cow.eat();  //吃草
    }
}
