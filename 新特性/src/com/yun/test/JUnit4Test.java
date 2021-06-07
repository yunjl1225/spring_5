package com.yun.test;

import com.yun.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 整合 JUnit4
 * @author Yunjl
 * @create 2021-05-22 10:40
 */
@RunWith(SpringJUnit4ClassRunner.class)     //指定正在使用的JUit(单元测试)版本
@ContextConfiguration("classpath:bean1.xml")    //加载配置文件
public class JUnit4Test {

    @Autowired
    private UserService userService;

    @Test
    public void test(){
        userService.accountMoney();
    }
}
