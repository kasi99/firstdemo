package com.kasi.firstdemo.test;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 05:55
 * @Version:
 */

public class ThreadDemo implements Runnable {

    private int taskNum;

    public ThreadDemo(int num){
        this.taskNum = num;
    }

    @Override
    public void run() {
        System.out.println(String.format("正在执行第_%s_个任务",taskNum));
        try {
            Thread.currentThread().sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(String.format("线程_%s_执行完毕",taskNum));
    }
}
