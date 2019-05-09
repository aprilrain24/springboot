package com.ajacom.cache;

import com.ajacom.cache.mapper.EmployeeMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootCacheApplicationTests {

    @Autowired
	EmployeeMapper employeeMapper;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    public void contextLoads() {
        log.info(employeeMapper.getEmpById(1).toString());
        //stringRedisTemplate.opsForValue();
    }
    @Test
    public void redis() {
       log.info(stringRedisTemplate.opsForValue().get("CakService.findCakMaxPoint?prchsOrg=W004&gdsBrnd=00001&secCtgry=R01"));
    }

}
