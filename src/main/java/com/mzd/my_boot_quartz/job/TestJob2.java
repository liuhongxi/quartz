package com.mzd.my_boot_quartz.job;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.mzd.my_boot_quartz.bean.User;
import com.mzd.my_boot_quartz.service.JobService;
import com.mzd.my_boot_quartz.service.UserService;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;


public class TestJob2 implements Job, Serializable {

    private static final long serialVersionUID = 1L;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义要输出日期字符串的格
    
    @Autowired
    private JobService jobService;

    @Autowired
    private UserService userService;
    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
    	
    	User user = userService.findById(1);
        System.out.println("TestJob2执行时间： "+sdf.format(new Date())+"   用户名称："+user.getUsername());
    }
}
