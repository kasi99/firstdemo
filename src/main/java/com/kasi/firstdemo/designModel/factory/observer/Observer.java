package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:25
 * @Version:
 */
public interface Observer {
    //观察者接收报警器的通知
    void update(String message);
}
