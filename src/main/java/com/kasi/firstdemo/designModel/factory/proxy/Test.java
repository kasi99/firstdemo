package com.kasi.firstdemo.designModel.factory.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-07 05:25
 * @Version:
 */

public class Test {
    public static void main(String[] args) {
        Curry curry = new Curry();
        InvocationHandler playerHandler = new PlayerHandler(curry);
        Class<?> cls = curry.getClass();

        Player player = (Player)Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), playerHandler);
        player.playBaseketBall();
    }
}
