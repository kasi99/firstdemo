package com.kasi.firstdemo.designModel.factory.observer;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-05 06:14
 * @Version:
 */

public class Test {
    public static void main(String[] args) {
        //创建一个被观察者
        Annunciator annunciator = new Annunciator();
        //创建三个观察者
        Observer duanYu = new DuanYu();
        Observer lionKing = new LionKing();
        Observer weiXiaoBao = new WeiXiaoBao();
        //将观察者添加到被观察者的通知对象集合中
        annunciator.addObserver(duanYu);
        annunciator.addObserver(lionKing);
        annunciator.addObserver(weiXiaoBao);

        System.out.println("===================警戒线第一次被触发==================");
        annunciator.notice();
        System.out.println("===================韦小宝胆小溜了==================");
        annunciator.removeObserver(weiXiaoBao);
        System.out.println("===================警戒线第二次被触发==================");
        annunciator.notice();
    }
}
