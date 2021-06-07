package com.yun.test;

import com.yun.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yunjl
 * @create 2021-05-21 10:48
 */
public class BookProxyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("aopxml.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
}
