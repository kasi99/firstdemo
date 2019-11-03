package com.kasi.firstdemo.demo;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-28 05:14
 * @Version:
 */

public class Game {
    public static void main(String[] args) {
        Curry curry = new Curry();
        Broker broker = new Broker(curry);
        /*只要去找经纪人，他就会安排库里打球*/
        broker.playBasketball();
    }
}
