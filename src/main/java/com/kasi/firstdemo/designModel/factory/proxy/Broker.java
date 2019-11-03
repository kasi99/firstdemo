package com.kasi.firstdemo.designModel.factory.proxy;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-03 21:30
 * @Version:
 */

public class Broker implements Player {

    private Player player;

    public Broker(Player player){
        this.player = player;
    }

    @Override
    public void playBaseketBall() {
        System.out.println("安排行程");
        player.playBaseketBall();
        System.out.println("收钱");
    }
}
