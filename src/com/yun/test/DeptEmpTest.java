package com.yun.test;

import com.yun.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**测试注入属性-内部 bean和注入属性-级联赋值
 * @author Yunjl
 * @create 2021-05-20 0:05
 */
public class DeptEmpTest {
    /**
     * 注入属性-内部 bean
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
    /**
     * 注入属性-级联赋值
     */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
