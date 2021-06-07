package com.yun.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志
 * @author Yunjl
 * @create 2021-05-22 10:26
 */
public class UserLog {
    //创建日志对象
    private static final Logger log= LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        //手动在控制台输出
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
