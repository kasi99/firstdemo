package com.kasi.firstdemo.demo;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-02 05:34
 * @Version:
 */

public class BananaFactory implements FinalFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }

    @Override
    public Juice getJuice() {
        return new BananaJuice();
    }
}
