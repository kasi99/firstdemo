package com.kasi.firstdemo.thread;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 11:19
 * @Version:
 */

public class Print implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(String.format("%s-线程开始，执行“打印”方法",name));
        User user = new User();
        user.print();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
        }
        System.out.println(String.format("%s-线程结束",name));
    }
}
