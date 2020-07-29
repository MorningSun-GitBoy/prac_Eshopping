package com.newshopping.dao;

import java.util.List;

import com.newshopping.entity.User;

public interface IUserDao {
    List<User> queryAllUser();
}
