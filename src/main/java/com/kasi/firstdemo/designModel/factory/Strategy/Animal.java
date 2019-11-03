package com.kasi.firstdemo.designModel.factory.Strategy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-03 06:40
 * @Version:
 */
/* 对草原上的动物进行定义 */
public class Animal {

    private Eat animal;
    public void eat() {
        animal.eat();
    }
    public void setEat(Eat animal) {
        this.animal = animal;
    }
}
