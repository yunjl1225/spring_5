package com.yun.service;

import com.yun.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yunjl
 * @create 2021-05-20 17:58
 */
//利用注解创建类的对象(等同于使用bean配置文件创建)
//@Component(value = "userService")
@Service            //与上面一样     value属性值可以不写，默认是类名，首字母小写
public class UserService {
    //使用注解注入普通属性值
    @Value(value = "yun")
    private String name;

    //定义UserDao类型的属性
    //不需要添加set方法
    //使用注解注入对象属性值
    @Autowired      //根据属性类型进行自动装配
    @Qualifier(value = "userDaoImpl")      //根据名称进行注入  和上面@Autowired 一起使用
    //@Resource  //根据类型进行注入
//    @Resource(name = "userDaoImpl")  //根据名称进行注入
    private UserDao userDao;

    public void add(){
        System.out.println("UserService类中的add方法，name属性值" + name);
        //调用UserDao中的方法
        userDao.add();
    }
}
