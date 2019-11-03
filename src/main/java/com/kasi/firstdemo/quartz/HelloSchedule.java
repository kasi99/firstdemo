package com.kasi.firstdemo.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre> TODO </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-17 06:01
 * @Version:
 */

public class HelloSchedule {
    public static void main(String[] args) throws SchedulerException {
        //创建一个JobDetail实例,将该实例与HelloJob Class绑定
        JobDetail jobDetail = JobBuilder.newJob(HelloJob.class).withIdentity("myJob", "group1").build();
        //创建一个Trigger实例,定义改job立即执行,并且每个两秒钟重复执行一次
        Trigger trigger  = TriggerBuilder.newTrigger().withIdentity("myTrigger", "group1").startNow()
                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                        .withIntervalInSeconds(2).repeatForever()).build();
        //创建Scheduler实例
        StdSchedulerFactory factory = new StdSchedulerFactory();
        Scheduler scheduler = factory.getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);
        //打印当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间:"+simpleDateFormat.format(date));
    }
}
