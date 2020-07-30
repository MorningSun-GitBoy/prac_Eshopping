package com.newshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.newshopping.service.IUserService;

public class UserController {
    @Autowired
    private IUserService userService;
}
