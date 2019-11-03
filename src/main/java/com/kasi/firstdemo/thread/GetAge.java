package com.kasi.firstdemo.thread;

import java.util.concurrent.Callable;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 11:13
 * @Version:
 */

public class GetAge implements Callable<User> {

    @Override
    public User call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println(String.format("%s-线程开始，执行setAge方法",name));
        User user= new User();
        user.setAge(12);
        Thread.sleep(3000);
        System.out.println(String.format("%s-线程结束",name));
        return user;
    }
}
