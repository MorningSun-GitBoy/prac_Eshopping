package com.newshopping.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newshopping.dao.IUserDao;
import com.newshopping.entity.User;
import com.newshopping.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserDao userDao;
    //持有Dao的引用，注释的目的是从IOC容器中寻找实现该接口的对象
    public List<User> queryAllUsers() {
	// TODO Auto-generated method stub
	return userDao.queryAllUser();
    }

}
