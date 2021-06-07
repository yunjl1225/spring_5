package com.yun.test;

import com.yun.entity.Book;
import com.yun.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunjl
 * @create 2021-05-21 14:22
 */
public class BookTest {
    Book book = new Book();
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.addBook(new Book("2","yun","n"));
    }
    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.update(new Book("12","yunasda","12"));
    }
    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.delete(new Book("112","yun","n"));
    }
    @Test
    public void testFindCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        int count = bookService.findCount(book);
        System.out.println("表中数据数：" + count);
    }
    @Test
    public void testFindObj(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book obj = bookService.findObj("2");
        System.out.println("表中id为2数据:" + obj);
    }
    @Test
    public void testFindObjList(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Book> objList = bookService.findObjList();
        System.out.println("表中数据:" + objList);
    }
    @Test
    public void testBatchAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"4","as","yes"};
        Object[] o2 = {"5","as","yes"};
        Object[] o3 = {"6","as","yes"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookService.batchAdd(batchArgs);
    }

}
