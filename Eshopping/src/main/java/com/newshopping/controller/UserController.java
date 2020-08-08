package com.newshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newshopping.entity.User;
import com.newshopping.service.IUserService;

@RestController
public class UserController {
    
    @Autowired
    private IUserService userService;
    
    @RequestMapping("/users")
    public List<User> queryAll() {
	List<User> queryList = userService.queryAllUsers();
	System.out.println(queryList);
	return queryList;
    }
}
