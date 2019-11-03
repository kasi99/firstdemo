package com.kasi.firstdemo.demo;

/**
 * <pre> 饿汉式 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-06-26 04:45
 * @Version:
 */

public class SingleHungry {
    /* 私有化构造函数 */
    private SingleHungry() {}
    /* 内部调用实例 */
    private static SingleHungry instance = new SingleHungry();
    /* 提供给外部一个访问方法 */
    public static SingleHungry getInstance(){
        return instance;
    }
}
