package com.yun.dao.Impl;

import com.yun.dao.BookDao;
import com.yun.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * 注入jdbcTemplate 对象
 * @author Yunjl
 * @create 2021-05-21 13:57
 */
@Repository         //创建对象
public class BookDaoImpl implements BookDao{
    //注入jdbcTemplate 对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //创建数据库的SQL语句
        String sql = "insert into t_book values(?,?,?)";
        //调用方法实现添加,返回影响行数
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println("影响数据库表中的行数：" + update);

    }

    @Override
    public void updtae(Book book) {
        //创建数据库的SQL语句
        String sql = "update t_book set username=?, uststus=? where user_id=?";
        //调用方法实现添加,返回影响行数
        int update = jdbcTemplate.update(sql, book.getUsername(), book.getUstatus(),book.getUserId());
        System.out.println("影响数据库表中的行数：" + update);
    }

    @Override
    public void delete(Book book) {
        //创建数据库的SQL语句
        String sql = "delete from  t_book  where user_id=?";
        //调用方法实现添加,返回影响行数
        int update = jdbcTemplate.update(sql,book.getUserId());
        System.out.println("影响数据库表中的行数：" + update);
    }



    @Override
    public int findCount() {
        //创建数据库的SQL语句
        String sql = "select count(*) from  t_book ";
        //调用方法实现添加,返回影响行数
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);

        return count;
    }

    @Override
    public Book findObj(String id) {
        String sql = "select * from  t_book where user_id=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class), id);
        return book;
    }

    @Override
    public List<Book> findObjList() {
        String sql = "select * from  t_book ";
        List<Book> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        //调用方法实现添加,返回影响行数
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
