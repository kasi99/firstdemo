package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:27
 * @Version:
 */
//韦小宝: 神行百变的轻功不是盖的
public class WeiXiaoBao implements Observer {

    public void sendMessage() {
        System.out.println("韦小宝:有人靠近了, 老婆们动作快点!");
    }

    @Override
    public void update(String message) {
        //TODO:对消息判断后输出
        sendMessage();
    }
}
