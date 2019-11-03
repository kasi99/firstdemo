package com.kasi.firstdemo.designModel.factory.singleTon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.Thread.sleep;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-01 04:10
 * @Version:
 */

class Demo {
    private Long createTime;
    private Demo() {
        this.createTime = System.currentTimeMillis();
    }
    private static Demo instance = null;
    public static Demo getInstance() throws InterruptedException {
        if (instance == null)
            synchronized (Demo.class) {
//                if (instance == null) {
                    sleep(1000);
                    instance = new Demo();
//                }
            }
        return instance;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}

