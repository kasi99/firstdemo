package com.kasi.firstdemo.designModel.factory.decorate;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-07 06:08
 * @Version:
 */

public class Build implements House {
    @Override
    public Integer area() {
        return 100;
    }

    @Override
    public Integer cost() {
        return 1000000;
    }
}
