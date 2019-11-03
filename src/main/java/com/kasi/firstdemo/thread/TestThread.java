package com.kasi.firstdemo.thread;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 09:54
 * @Version:
 */

public class TestThread {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");//设置日期格式
        ThreadPoolExecutor pool = new ThreadPoolExecutor(5, 10, 200,
                TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        GetName getName = new GetName();
        //User user = getName.call();   // 线程方法直接获取返回值
        Future<User> submit = pool.submit(getName);
        List<Future<User>> futures = new ArrayList<>();
        futures.add(submit);
        User getNameUser = getName.call();

    }

    /**
     *
     * @param type
     * @param num
     * @Author HuangTao
     * @Date 2018/12/07
     */
    public String test(String type,Integer num) {
        return "12";
    }
}
