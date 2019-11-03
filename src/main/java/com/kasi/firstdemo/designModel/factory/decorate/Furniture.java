package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:19
 * @Version:
 */

public abstract class Furniture implements House {

    protected House house;
    public Furniture(House myHouse) {
        this.house = myHouse;
    }
    public Integer area() {
        return house.area();
    }
    public Integer cost() {
        return house.cost();
    }
}
