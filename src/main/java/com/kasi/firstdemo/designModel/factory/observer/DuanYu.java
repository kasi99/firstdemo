package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:32
 * @Version:
 */
//段誉:凌波微步速度也不慢
public class DuanYu implements Observer {

    public void sendMessage() {
        System.out.println("段誉:有人靠近了, 神仙姐姐抓紧时间啊!");
    }

    @Override
    public void update(String message) {
        //TODO:对消息判断后输出
        sendMessage();
    }
}
