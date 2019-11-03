package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:27
 * @Version:
 */

public class Desk extends Furniture {
    public Desk(House house) {
        super(house);
    }

    public Integer area() {
        return super.area() - 1;
    }
    public Integer cost() {
        return super.cost() + 1000;
    }
}
