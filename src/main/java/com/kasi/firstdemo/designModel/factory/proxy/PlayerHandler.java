package com.kasi.firstdemo.designModel.factory.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-07 05:19
 * @Version:
 */

public class PlayerHandler implements InvocationHandler {


    public PlayerHandler(Object target) {
        super();
        this.targert = target;
    }
    private Object targert;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打打球");
        method.invoke(targert);
        return null;
    }
}
