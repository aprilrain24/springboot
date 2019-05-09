package com.ajacom.cache.mapper;

import com.ajacom.cache.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * @author liucm
 *         Date 2019/4/4
 *         Time 15:03
 */
@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id= #{id}")
    public Employee getEmpById(Integer id);

    @Insert("insert into employee (lastName,gender,email,d_id) values(#{lastName},#{gender},#{email},#{dId})")
    public void insertEmp(Employee employee);

    @Delete("delete from employee where id=#{id}")
    public void deleteById(Integer id);

    @Update("update employee set lastName=#{lastName},gender=#{gender},email=#{email},d_id=#{dId}")
    public void update(Employee employee);

    @Select("select * from employee where lastName=#{name}")
    public Employee getEmpByName(String name);
}
