package com.yun.test;

import com.yun.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试使用spring创建User类的对象
 * @author Yunjl
 * @create 2021-05-19 17:05
 */
public class UserTest {
    @Test
    public void test1(){
        //加载spring的配置文件 bean1.xml
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");//配置文件在src目录下
//                new FileSystemXmlApplicationContext("");//配置文件的绝对路径

        //2、获取配置创建的对象user
        User user = context.getBean("user", User.class);//参数里的user为配置文件里的别名
        System.out.println(user);   //user对象的地址
        user.add();                 //调用User的add方法

    }
}
