package com.newshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//使用此注解可以在SpringMVC中被扫描到
public class TestCon {
    @RequestMapping("/test.do")
    public String test() {
	return "test";//返回的字符串是页面的名字
    }
}
