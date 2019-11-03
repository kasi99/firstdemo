package com.kasi.firstdemo.test;

import com.kasi.firstdemo.entity.Student;

import javax.validation.constraints.NotNull;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2019-03-17 21:01
 * @Version:
 */

public class TestBuild {
    public static void main(String[] args) {
        Student student = new Student();
        new Student("12", "23", "");
        new Student("df");
        test(student);
    }

    public static void test(@NotNull Student val) {
        System.out.println(val);
    }
}
