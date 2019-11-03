package com.kasi.firstdemo.designModel.factory.singleTon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-01 04:24
 * @Version:
 */

public class SingleTon implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
//                sleep(10);
                System.out.println(Thread.currentThread().getName() + "==" +Demo.getInstance().getCreateTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SingleTon singleTon = new SingleTon();
        Thread thread1 = new Thread(singleTon, "线程1");
        Thread thread2 = new Thread(singleTon, "线程2");
        Thread thread3 = new Thread(singleTon, "线程3");
        Thread thread4 = new Thread(singleTon, "线程4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }

}
