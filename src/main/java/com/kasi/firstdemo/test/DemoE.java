package com.kasi.firstdemo.test;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-10-13 06:47
 * @Version:
 */

public class DemoE extends Demo {
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && object.getClass() == Demo.class) {
            Demo demo = (Demo) object;
            if (this.getAge().equals(demo.getAge()) && this.getName().equals(demo.getName())) {
                return true;
            }
        }
        return false;
    }

}
