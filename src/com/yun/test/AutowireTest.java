package com.yun.test;

import com.yun.autowire.Employees;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试自动装配
 * @author Yunjl
 * @create 2021-05-20 16:49
 */
public class AutowireTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Employees employees = context.getBean("employee", Employees.class);

        System.out.println(employees);
        employees.test();

    }
}
