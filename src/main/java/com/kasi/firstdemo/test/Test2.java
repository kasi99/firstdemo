package com.kasi.firstdemo.test;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-09-08 16:52
 * @Version:
 */

public class Test2 {
    public static void main(String[] args) {
//        String str = "2017-08至今——公司:东莞山海边乐享无忧旅游度假管理有限公司(50-150人)";
        String s = "2015-09至2018-06——广东创新科技职业学院";
//        String str1[] = str.split("[至——]");
        String sdsf[] = s.split("[至——]");

        for (String sdf : sdsf) {
            System.out.println(sdf);
        }
    }
}
