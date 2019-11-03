package com.kasi.firstdemo.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <pre> 任务调度器 </pre>
 *
 * @Author: HuangTao
 * @Date: 2018-07-17 05:57
 * @Version:
 */

public class HelloJob implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //打印当前时间
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间:"+simpleDateFormat.format(date));
        System.out.println("hello job");
    }
}
