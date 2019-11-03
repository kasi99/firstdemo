package com.kasi.firstdemo.designModel.factory.simpleFactory;

import org.junit.jupiter.api.Test;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-12 05:37
 * @Version:
 */

public class Driver {
    @Test
    public Car test(String car) throws Exception {
        if ("Benz".equals(car)) {
            return new Benz();
        } else if ("BMW".equals(car)) {
            return new BMW();
        } else throw new Exception();
    }
}
