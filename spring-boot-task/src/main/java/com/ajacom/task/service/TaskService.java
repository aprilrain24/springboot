package com.ajacom.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author liucm
 *         Date 2019/4/15
 *         Time 15:09
 */
@Service
public class TaskService {

    @Async
    public void getHello() {
        try {
            Thread.sleep(3000);
            System.out.println("say hello !");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // second minute, hour, day of month, month and day of week
    @Scheduled(cron = "0 * * * * MON-FRI")
    public void schedule(){
        System.out.println(" say schedule :");
    }
}
