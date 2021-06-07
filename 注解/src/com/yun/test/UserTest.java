package com.yun.test;

import com.yun.config.SpringConfig;
import com.yun.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试使用注解创建对象
 * @author Yunjl
 * @create 2021-05-20 18:04
 */
public class UserTest {
    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();
    }

    /**
     * 使用完全注解替代xml配置文件的测试
     */
    @Test
    public void test2(){
        //加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);

        userService.add();

    }

}
