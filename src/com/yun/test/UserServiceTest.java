package com.yun.test;
import com.yun.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试UserService注入属性-外部 bean（UserDao）
 * @author Yunjl
 * @create 2021-05-19 23:19
 */
public class UserServiceTest {
    @Test
    public void test(){
        //1、加载spring的配置文件 bean2.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2、首先获取配置创建的UserService对象userService
        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
//
//        UserDao userDao = context.getBean("userDao",UserDao.class);
//
//        userDao.update();
    }
}
