package com.yun.aopxml;

/**
 * 增强类
 * @author Yunjl
 * @create 2021-05-21 10:36
 */
public class BookProxy {
    //前置通知
    public void before(){
        System.out.println("增强类BookProxy类的before方法");
    }
}
