package com.kasi.firstdemo;

import org.junit.Test;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-06-03 05:43
 * @Version:
 */

public class Parent {
    public void say(){
        System.out.println("I am parent");
    }
}
class A extends Parent{
    public void say(){
        System.out.println("I am A");
    }
}
class B extends Parent{
    public void say(){
        System.out.println("I am B");
    }
}
class Demo{
    public static void main(String[] args) {
        // 第一种写法
        Parent a = new A();
        Parent b = new B();
        a.say();    // I am A
        b.say();    // I am A
        //第二种写法
        A a1 = new A();     // I am A
        B b1 = new B();     // I am A
        a1.say();
        b1.say();
    }
}