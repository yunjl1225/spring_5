package com.yun.service;

import com.yun.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Yunjl
 * @create 2021-05-21 20:31
 */
@Service        //创建对象
@Transactional(timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)  //事务注解（也可以加在方法上面）
public class UserService {
    //注入dao
    @Autowired
    private UserDao userDao;

    //转账的方法
    public void accountMoney(){
//        try {
            //1、开启事务

            //2、转账操作
            userDao.reduceMoney();
            //模拟异常  inti= 11/0;
            userDao.addMoney();

            //3、如果没有异常，事务提交

//        } catch (Exception e) {
//            //4、有异常，事务回滚
//
//            e.printStackTrace();
//        }

    }

}
