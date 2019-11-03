package com.kasi.firstdemo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-03-17 20:47
 * @Version:
 */

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        List<String> collect = list.stream().filter(item -> change(item)).collect(Collectors.toList());
        list.stream().map(item -> item+"test").forEach(System.out::println);

    }
    public static boolean change(String obj){
        if (obj.equals("bbb")) {
            return true;
        }
        return false;
    }
}
