package com.kasi.firstdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableAutoConfiguration
@MapperScan("com.kasi.firstdemo.dao")
public class FirstdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstdemoApplication.class, args);
        System.out.println("###########################################################################springboot项目启动完成###########################################################################");
        System.out.println("###########################################################################程序员们赶紧起床敲代码###########################################################################");
    }
}
