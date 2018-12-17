package com.mzd.my_boot_quartz.job;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.mzd.my_boot_quartz.bean.User;
import com.mzd.my_boot_quartz.config.SpringJobFactory;
import com.mzd.my_boot_quartz.service.JobService;
import com.mzd.my_boot_quartz.service.UserService;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;


public class TestJob implements Job, Serializable {

    private static final long serialVersionUID = 1L;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//定义要输出日期字符串的格
    
    @Autowired
    private JobService jobService;

    @Autowired
    private UserService userService;
    
    @Autowired
    SpringJobFactory springJobFactory;
    
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
    	System.out.println("TestJob1当前执行时间： "+sdf.format(new Date()));
    	List< User> list = userService.findUserList();
    	for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
//			System.out.println("TestJob1--username ： "+user.getUsername());
		}
    }
}
