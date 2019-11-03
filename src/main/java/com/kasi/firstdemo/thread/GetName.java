package com.kasi.firstdemo.thread;

import java.util.concurrent.Callable;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 09:59
 * @Version:
 */

public class GetName implements Callable<User> {

    @Override
    public User call() throws Exception {
        String name = Thread.currentThread().getName();
        System.out.println(String.format("%s-线程开始，执行setName方法",name));
        User user= new User();
        user.setName("张三");
        Thread.sleep(2000);
        System.out.println(String.format("%s-线程结束",name));
        return user;
    }
}
