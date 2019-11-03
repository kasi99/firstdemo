package com.kasi.firstdemo.demo;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-05-30 06:13
 * @Version:
 */

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.test(5L);
        Integer i;
    }

    public void test(int a) {
        System.out.println("int="+a);
    }

    public void test(long a) {
        System.out.println("long="+a);
    }

    public void test(short a) {
        System.out.println("short="+a);
    }
}
