package com.kasi.firstdemo.test;

import lombok.Data;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-10-13 06:01
 * @Version:
 */
@Data
public class Demo {
    private String name;
    private Integer age;
    private String address;

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) {
//            return true;
//        }
//        if (object != null && object.getClass() == Demo.class) {
//            Demo demo = (Demo) object;
//            if (this.getAge().equals(demo.getAge()) && this.getName().equals(demo.getName())) {
//                return true;
//            }
//        }
//        return false;
//    }
}
