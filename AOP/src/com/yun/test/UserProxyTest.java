package com.yun.test;

import com.yun.aopanno.User;
import com.yun.config.ConfigAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于注解实现 AOP 操作（增强方法）的测试
 * @author Yunjl
 * @create 2021-05-20 23:22
 */
public class UserProxyTest {
    @Test
    public void testAopAnno(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopanno.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }
    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }
}
