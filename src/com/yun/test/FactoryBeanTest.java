package com.yun.test;

import com.yun.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 工厂bean测试
 * @author Yunjl
 * @create 2021-05-20 15:21
 */
public class FactoryBeanTest {
    @Test
    public void test(){
        //1、加载spring的配置文件 bean1.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("factorybean.xml");
        //2、获取配置创建的对象book
        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println(myBean);

    }
}
