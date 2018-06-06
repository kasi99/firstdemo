package com.kasi.firstdemo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-06-02 05:32
 * @Version:
 */

public class ArrayTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("kasi");
        user.setSex("nan");
        List list = new ArrayList();
        list.add(user);
        User o = (User)list.get(0);
        o.getName();
    }

}

@Data
class User{
    private String name;
    private String sex;
}