package com.ajacom.cache.controller;

import com.ajacom.cache.bean.Employee;
import com.ajacom.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liucm
 *         Date 2019/4/10
 *         Time 11:04
 */
@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable Integer  id){
        return employeeService.queryById(id);
    }
}
