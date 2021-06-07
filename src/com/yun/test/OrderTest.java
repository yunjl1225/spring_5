package com.yun.test;

import com.yun.spring.Orders;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yunjl
 * @create 2021-05-19 22:12
 */
public class OrderTest {
    @Test
    public void test(){
        //1、加载spring的配置文件 bean1.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象book
        Orders orders = context.getBean("orders",Orders.class);

        orders.show();
    }
}
