package com.yun.test;

import com.yun.spring.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试集合的属性注入
 * @author Yunjl
 * @create 2021-05-20 11:03
 */
public class StuTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Stu stu = context.getBean("stu",Stu.class);

        stu.test();


    }
}
