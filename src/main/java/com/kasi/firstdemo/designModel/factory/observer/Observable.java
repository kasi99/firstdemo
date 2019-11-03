package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 05:14
 * @Version:
 */
// 被观察者
public interface Observable {

    void addObserver(Observer ob);  //添加观察者对象,目前就是金毛狮王、段誉和韦蝠王三人

    void removeObserver(Observer ob);   //移除观察者

    void notice();   //警报器的触发警报
}
