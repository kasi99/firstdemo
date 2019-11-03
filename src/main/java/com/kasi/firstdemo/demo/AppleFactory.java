package com.kasi.firstdemo.demo;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-02 05:33
 * @Version:
 */

public class AppleFactory implements FinalFactory {
    @Override
    public Fruit getFruit() {
        return new Apple();
    }

    @Override
    public Juice getJuice() {
        return new AppleJuice();
    }
}
