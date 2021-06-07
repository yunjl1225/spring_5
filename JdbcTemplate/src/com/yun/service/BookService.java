package com.yun.service;

import com.yun.dao.BookDao;
import com.yun.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 注入BookDao
 * @author Yunjl
 * @create 2021-05-21 13:56
 */
@Service        //创建对象
public class BookService {
    //注入Dao
    @Autowired
    private BookDao bookDao;

    //数据库添加数据的方法
    public void addBook(Book book){
        bookDao.add(book);
    }
    //修改数据库数据的方法
    public void update(Book book){
        bookDao.updtae(book);
    }
    //删除数据库数据的方法
    public void delete(Book book){
        bookDao.delete(book);
    }
    //查询表中的记录数
    public int findCount(Book book){

        return bookDao.findCount();
    }
    //查询一条数据，返回对象
    public Book findObj(String id){

        return bookDao.findObj(id);
    }
    //查询多条数据，返回集合
    public List<Book> findObjList(){

        return bookDao.findObjList();
    }
    //利用集合批量添加数据
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);

    }

}
