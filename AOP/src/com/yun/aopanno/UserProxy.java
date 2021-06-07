package com.yun.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类
 * @author Yunjl
 * @create 2021-05-20 23:04
 */
@Component  //创建对象
@Aspect     //生成代理对象
@Order(3)   //表示多个增强类之间的优先级,数字越小，优先级越大。
public class UserProxy {

    //抽取相同的切入点表达式
    @Pointcut(value = "execution(* com.yun.aopanno.User.add(..))")       //切入点的注解,里面是切入点表达式
    public void point(){
    }

    //前置通知
    @Before(value = "point()")  //表示前置通知，里面是提取了切入点表达式的方法
    public void before(){
        System.out.println("增强类的前置before方法");
    }

    //后置通知（方法返回值后通知）//如果add方法有异常，这里不会执行
    @AfterReturning(value = "execution(* com.yun.aopanno.User.add(..))")    //里面是切入点表达式
    public void afterReturning(){
        System.out.println("增强类的后置afterReturning方法");
    }

    //最终通知（方法执行后通知）
    @After(value = "point()")
    public void after(){
        System.out.println("增强类的最终after方法");
    }

    //异常通知（add方法有异常才执行）
    @AfterThrowing(value = "point()")
    public void afterThrowing(){
        System.out.println("增强类的异常afterThrowing方法");
    }

    //环绕通知
    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("增强类的环绕around之前");

        //被增强的方法在中间执行
        proceedingJoinPoint.proceed();//表示执行被增强的方法

        System.out.println("增强类的环绕around之后");       //如果add方法有异常，这里不会执行
    }

   /* 输出结果
    add方法没有异常
            增强类的环绕around之前
            增强类的前置before方法
            User类的add方法
            增强类的环绕around之后
            增强类的最终after方法
            增强类的后置afterReturning方法

    add方法有异常
            增强类的环绕around之前
            增强类的前置before方法
            增强类的最终after方法
            增强类的异常afterThrowing方法
    */
}
