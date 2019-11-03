package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:26
 * @Version:
 */

public class Bed extends Furniture {
    public Bed(House house) {
        super(house);
    }

    public Integer area() {
        return super.area() - 4;
    }
    public Integer cost() {
        return super.cost() + 10000;
    }
}
