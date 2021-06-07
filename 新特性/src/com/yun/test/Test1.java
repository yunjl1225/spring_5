package com.yun.test;

import com.yun.pojo.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Yunjl
 * @create 2021-05-22 10:24
 */
public class Test1 {
    public static void main(String[] args) {

        System.out.println("日志");
    }

    //函数式风格创建对象，交给spring进行管理
    @Test
    public void testGenericApplicationContext() {
        //1 创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用context的方法对象注册
        context.refresh();
        context.registerBean("user1",User.class,() -> new User());
        //3 获取在spring注册的对象
        // User user = (User)context.getBean("com.yun.pojo.User");
        User user = (User)context.getBean("user1");
        System.out.println(user);
    }

}
