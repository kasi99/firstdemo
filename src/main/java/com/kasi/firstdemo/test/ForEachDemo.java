package com.kasi.firstdemo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-07 06:29
 * @Version:
 */

public class ForEachDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("four");
        list.add("five");
        list.stream().limit(1).filter(item -> item.contains("f")).forEach(item -> System.out.println(item));
    }



    public String test(String name, int age) {
        System.out.println();
        return "";
    }
}
