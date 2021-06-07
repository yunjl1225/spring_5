package com.yun.dao;

import com.yun.entity.Book;

import java.util.List;

/**
 * @author Yunjl
 * @create 2021-05-21 13:57
 */
public interface BookDao {
    //添加数据的方法
    void add(Book book);

    void updtae(Book book);

    void delete(Book book);

    int findCount();

    Book findObj(String id);

    List<Book> findObjList();


    void batchAdd(List<Object[]> batchArgs);
}
