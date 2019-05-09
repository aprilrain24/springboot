package com.ajacom.task.controller;

import com.ajacom.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liucm
 *         Date 2019/4/15
 *         Time 15:08
 */
@RestController
public class TaskController {
    @Autowired
    TaskService taskService;

    @GetMapping("/hello")
    public String hello() {
        taskService.getHello();
        return "success";
    }

    @GetMapping("/sendMail")
    public String sendMail() {
        return "success";
    }
}
