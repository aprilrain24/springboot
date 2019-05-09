package com.ajacom.cache.service;

import com.ajacom.cache.bean.Employee;
import com.ajacom.cache.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

/**
 * @author liucm
 *         Date 2019/4/10
 *         Time 11:00
 */
@Slf4j
@Service
@CacheConfig(cacheNames = "emp")
public class EmployeeService {
    @Autowired
    CacheManager cacheManager;
    @Autowired
    EmployeeMapper employeeMapper;

    @Cacheable(key = "#id")
    public Employee queryById(Integer id) {
        log.info("查询:" + id + "员工");
        //cacheManager.getCache("").编码时手动放入缓存
        return employeeMapper.getEmpById(id);
    }

    @CachePut(key = "#employee.id")
    public void insert(Employee employee) {
        employeeMapper.insertEmp(employee);
    }

    @CacheEvict(key = "#id")
    public void delete(Integer id) {
        employeeMapper.deleteById(id);
    }

    @Caching(cacheable = {
            @Cacheable(key = "#name")
    },
    put = {
            @CachePut(key = "#result.id"),
            @CachePut(key = "#result.email")
    })
    public Employee getEmp(String name) {
        return employeeMapper.getEmpByName(name);
    }
}
