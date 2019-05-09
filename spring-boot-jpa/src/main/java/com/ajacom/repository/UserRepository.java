package com.ajacom.repository;

import com.ajacom.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 14:09
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
