package com.mzd.my_boot_quartz.job;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mzd.my_boot_quartz.service.JobService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;


public class TestJob3 implements Job, Serializable {

    private static final long serialVersionUID = 1L;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义要输出日期字符串的格
    
    @Autowired
    private JobService jobService;

    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
//        jobService.doTest3();
        System.out.println("TestJob3任务执行成功!当前执行时间：     "+sdf.format(new Date()));
    }
}
