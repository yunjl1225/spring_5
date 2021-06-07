package com.yun.aopxml;

/**
 * 基于xml配置文件的 AOP 操作（AspectJ 配置文件）
 * 被增强类
 * @author Yunjl
 * @create 2021-05-21 10:34
 */
public class Book {
    public void buy(){
        System.out.println("Book类的buy方法");
    }
}
