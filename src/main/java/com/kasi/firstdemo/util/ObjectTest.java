package com.kasi.firstdemo.util;

import com.kasi.firstdemo.entity.User;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-30 07:20
 * @Version:
 */

public class ObjectTest {
    private Object o;
    public ObjectTest(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest(new User());
        User o = (User) objectTest.getO();
        objectTest.showType();
    }

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }
    public void showType() {
        System.out.println("类型:"+o.getClass().getName());
    }
}
