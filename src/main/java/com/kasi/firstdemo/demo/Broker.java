package com.kasi.firstdemo.demo;

/**
 * <pre> 经纪人 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-28 04:55
 * @Version:
 */
/* 经纪人 */
public class Broker implements Player {
    /*运动员就是经纪人的代理对象*/
    Player player;
    /*创建代理对象时注入被代理对象，这个好理解，你通过经纪人联系谁来打球你得清楚吧*/
    public Broker(Player player){
        this.player = player;
    }
    /*通过被代理对象实现具体方法*/
    @Override
    public void playBasketball() {
        player.playBasketball();
    }
}
