package com.kasi.firstdemo.demo;

/**
 * <pre> 懒汉式 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-26 04:56
 * @Version:
 */

public class SingleLazy {
    /* 私有化构造函数 */
    private SingleLazy(){}
    /* 定义一个空实例 */
    private volatile static SingleLazy instance = null;   //增加volatile修饰符
    /* 静态工厂方法 */
    public static SingleLazy getInstance() {
        if (instance == null) {
            synchronized (SingleLazy.class) {   //增加同步锁
                if (instance == null) {
                    instance = new SingleLazy();
                }
            }
        }
        return instance;
    }
}
