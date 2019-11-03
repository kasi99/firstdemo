package com.kasi.firstdemo.test;

import com.kasi.firstdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-08-04 05:13
 * @Version:
 */
@Component
public class Test1 implements Runnable{

    @Autowired
    StudentService studentService;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            String date = null;
            try {
                date = studentService.getDate();
            System.out.println(Thread.currentThread().getName() + ":" + date);
            } catch (InterruptedException e) {
        }}
    }
}
