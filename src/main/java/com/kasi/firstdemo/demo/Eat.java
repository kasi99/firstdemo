package com.kasi.firstdemo.demo;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-02 06:20
 * @Version:
 */

public class Eat {
    public static void main(String[] args) {
        // 苹果工厂生产
        AppleFactory appleFactory = new AppleFactory();
        appleFactory.getFruit().eat();      //吃苹果
        appleFactory.getJuice().drink();    //喝苹果汁
        // 香蕉工厂生产
        BananaFactory bananaFactory = new BananaFactory();
        bananaFactory.getFruit().eat();     //吃香蕉
        bananaFactory.getJuice().drink();   //喝香蕉汁
    }
}
