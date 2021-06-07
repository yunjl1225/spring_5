package com.yun.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 第二个增强类
 * @author Yunjl
 * @create 2021-05-20 23:52
 */
@Component  //创建对象
@Aspect     //生成代理对象
@Order(1)   //表示多个增强类之间的优先级,数字越小，优先级越大。
public class UserProxy2 {

    //前置通知
    @Before(value = "execution(* com.yun.aopanno.User.add(..))")  //表示前置通知，里面是切入点表达式
    public void before(){
        System.out.println("第二个增强类的前置before方法");
    }
}
