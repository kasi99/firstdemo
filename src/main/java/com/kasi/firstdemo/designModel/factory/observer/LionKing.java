package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:38
 * @Version:
 */
//谢逊:金毛狮王的狮吼功可以远距离发送通知
public class LionKing implements Observer {

    public void sendMessage() {
        System.out.println("金毛狮王:有人靠近了, 张教主请注意!");
    }

    @Override
    public void update(String message) {
        //TODO:对消息判断后输出
        sendMessage();
    }
}
