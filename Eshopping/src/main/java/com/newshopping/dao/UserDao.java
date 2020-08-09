package com.newshopping.dao;

import java.util.List;

import com.newshopping.entity.User;

public interface UserDao {
    List<User> queryAllUser();
}
