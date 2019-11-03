package com.kasi.firstdemo.improve;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-04-02 05:51
 * @Version:
 */

public class Test1 {
    public static void main(String[] args) {
        final ArrayList<String> aList = new ArrayList<>();
        aList.add("a");
        aList.add("b");
        aList.add("c");
        final ArrayList<String> bList = new ArrayList<>();
        bList.add("b");
        bList.add("c");
        bList.add("d");
//        aList.removeAll(bList);
//        System.out.println(aList);
        final HashSet<String> hashSet = new HashSet<>();
        aList.remove("a");
        System.out.println(aList);
    }
}
