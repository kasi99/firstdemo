package com.kasi.firstdemo.combine;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-12-02 07:00
 * @Version:
 */

public class Test {
    public static void main(String[] args) throws Exception {
        Demo demo1 = new Demo();
        demo1.setId(111L);
        demo1.setName("张无忌");
        demo1.setAddress("光明顶");
        Demo demo2 = new Demo();
        demo2.setEducate("文盲");
        demo2.setAge(18);
        try {
            CombineObj.merge(demo1,demo2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("demo1" + demo1);
        System.out.println("demo2" + demo2);
    }

}
