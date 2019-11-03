package com.kasi.firstdemo.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 05:59
 * @Version:
 */

public class ThreadTest {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(5));
        for (int i = 0; i < 30; i++) {
            ThreadDemo threadDemo = new ThreadDemo(i);
            executor.execute(threadDemo);
            System.out.println(String.format("线程池中线程数目：%s,队列中等待执行的线程数目：%s，已执行完毕的任务数目：%s",
                    executor.getPoolSize(),executor.getQueue().size(),executor.getCompletedTaskCount()));
        }
        executor.shutdown();
    }
}
