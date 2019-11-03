package com.kasi.firstdemo.test;

import com.kasi.firstdemo.util.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import java.text.ParseException;

/**
 * ${TODO}
 *
 * @Author: HuangTao
 * @Date: 2018-06-01 05:35
 * @Version:
 */

public class DemoTest {
    @Autowired
    ApplicationContext ioc;
    @Test
    public void test() throws ParseException {
        String currentTimeByDay = DateUtils.getCurrentTimeByDay();
        System.out.println(currentTimeByDay);
        String currentTime = DateUtils.getCurrentTime("yyyy/MM/dd hh:mm:ss");
        System.out.println(currentTime);
        boolean helloService = ioc.containsBean("HelloService");

        System.out.println(helloService);
//        Date date = DateUtils.pStringToDate(, "dd-MM-yyyy");
//        System.out.println(date);
    }

    @Test
    public void tset1(){
        String record = "456s4fsd54aaaaaaafs65df4s6f4";
        String a = record.replaceAll("a", "");
        System.out.println(record);
        System.out.println(a);
    }
}
