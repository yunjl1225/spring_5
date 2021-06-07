package com.yun.test;

import com.yun.utils.BeanUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Yunjl
 * @create 2021-05-20 11:52
 */
public class UtilTest {
    @Test
    public void test(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml");
        BeanUtils util = context.getBean("util", BeanUtils.class);
        util.test();
    }
}
