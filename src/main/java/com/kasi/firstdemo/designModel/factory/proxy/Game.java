package com.kasi.firstdemo.designModel.factory.proxy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-03 21:32
 * @Version:
 */

public class Game {
    public static void main(String[] args) {
        Player player = new Curry();
        Broker broker = new Broker(player);
        broker.playBaseketBall();
    }
}
