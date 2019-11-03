package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:23
 * @Version:
 */

public class Sofa extends Furniture {

    public Sofa(House house) {
        super(house);
    }

    public Integer area() {
        return super.area() - 3;
    }
    public Integer cost() {
        return super.cost() + 5000;
    }
}
