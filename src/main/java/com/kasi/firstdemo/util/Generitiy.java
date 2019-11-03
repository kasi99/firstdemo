package com.kasi.firstdemo.util;

import com.kasi.firstdemo.entity.User;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-30 07:02
 * @Version:
 */

public class Generitiy<T> {
    private T t;
    public Generitiy() {

    }
    public Generitiy(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        Generitiy<User> userGeneritiy = new Generitiy<User>(new User());
        User t = userGeneritiy.getT();
        Generitiy<Integer> integerGeneritiy = new Generitiy<Integer>(33);
        integerGeneritiy.showType();
        System.out.println(integerGeneritiy.getT());
        Generitiy<Long> objectGeneritiy = new Generitiy<>();
        objectGeneritiy.setT(1L);
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void showType() {
        System.out.println("实际类型:" + t.getClass().getName());
    }
}
