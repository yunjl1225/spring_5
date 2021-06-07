package com.yun.test;

import com.yun.service.UserService;
import com.yun.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//整合 JUnit5
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:bean1.xml")

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class JUnit5Test {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
