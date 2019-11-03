package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-02 06:41
 * @Version:
 */

public class Lion implements Animals {
    @Override
    public void eat() {
        System.out.println("肉");
    }
}
