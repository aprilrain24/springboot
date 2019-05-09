package com.ajacom.mapper;

import com.ajacom.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liucm
 *         Date 2019/4/4
 *         Time 15:03
 */
@Mapper
public interface EmployeeMapper {
    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
