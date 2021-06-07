package com.yun.test;

import com.yun.spring.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yunjl
 * @create 2021-05-19 20:30
 */
public class BookTest {
    @Test
    public void test1(){
        //1、加载spring的配置文件 bean1.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //2、获取配置创建的对象book
        Book book = context.getBean("book",Book.class);

        book.show();
    }
}
