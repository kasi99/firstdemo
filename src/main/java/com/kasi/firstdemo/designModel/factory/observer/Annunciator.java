package com.kasi.firstdemo.designModel.factory.observer;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:46
 * @Version:
 */
//银行
public class Annunciator implements Observable {
    //定义一个集合用来存放观察者,因为警报器是这三个人拉的,所以目前只有这三个人观察者能收到信息
    private List<Observer> list;

    public Annunciator() {
        list = new ArrayList<>();
    }

    //添加观察者,可能后续有其他团伙要加入
    @Override
    public void addObserver(Observer ob) {
        list.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        list.remove(ob);
    }

    //警报器发送通知
    @Override
    public void notice() {
        for (Observer ob : list) {
            ob.update("滴~滴~滴~滴~");
        }
    }



}
