package com.yun.aopanno;

import org.springframework.stereotype.Component;

/**
 *  被增强类
 * @author Yunjl
 * @create 2021-05-20 23:03
 */
@Component  //创建对象
public class User {
    public void add(){
        System.out.println("User类的add方法");
    }
}
