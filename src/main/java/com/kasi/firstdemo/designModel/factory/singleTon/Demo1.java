package com.kasi.firstdemo.designModel.factory.singleTon;

import static java.lang.Thread.sleep;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-01 05:30
 * @Version:
 */

public class Demo1 {
    private Long createTime;
    private Demo1() {
        this.createTime = System.currentTimeMillis();
    }

    private static Demo1 instance = new Demo1();
    public static Demo1 getInstance() throws InterruptedException {
        sleep(1000);
        return instance;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}

