package com.yun.service;
import com.yun.dao.UserDao;
/**
 * 注入属性-外部 bean
 * 在 service 调用 dao 里面的方法
 * @author Yunjl
 * @create 2021-05-19 22:46
 */
public class UserService {
    //1、创建UserDao类型的属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //2、设置配置文件
    //3、UserServiceTest测试

    public void add(){
        System.out.println("service的add方法");
        /*
        //普通方法创建UserDao对象
        UserDao userDao = new UserDaoImpl();
        userDao.update();
        */

        //使用spring配置创建UserDao对象，调用方法
        userDao.update();
    }
}
