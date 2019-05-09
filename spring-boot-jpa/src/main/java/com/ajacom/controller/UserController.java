package com.ajacom.controller;

import com.ajacom.entity.User;
import com.ajacom.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liucm
 *         Date 2019/4/9
 *         Time 14:10
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userRepository.findOne(id);
    }

    @GetMapping("/user")
    public User getUser(User user) {
        return userRepository.save(user);
    }
}
