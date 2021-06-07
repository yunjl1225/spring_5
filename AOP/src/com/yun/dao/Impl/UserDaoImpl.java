package com.yun.dao.Impl;

import com.yun.dao.UserDao;

/**
 * @author Yunjl
 * @create 2021-05-20 21:57
 */
public class UserDaoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
