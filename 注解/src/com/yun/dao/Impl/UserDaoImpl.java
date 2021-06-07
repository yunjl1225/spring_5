package com.yun.dao.Impl;

import com.yun.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Yunjl
 * @create 2021-05-20 18:25
 */
@Repository //创建对象
public class UserDaoImpl implements UserDao{

    @Override
    public void add() {
        System.out.println("UserDao的add方法");
    }
}
