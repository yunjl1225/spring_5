package yun.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yun.config.txConfig;
import yun.service.UserService;

/**
 * 测试转账事务
 * @author Yunjl
 * @create 2021-05-21 20:43
 */
public class UserServiceTest {
    /**
     * 测试基于注解的事务
     */
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
    /**
     * 测试基于xml的事务,(需要注释掉txConfig中的开启事务代码)
     */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 测试使用全注解
     */
    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(txConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }
}
