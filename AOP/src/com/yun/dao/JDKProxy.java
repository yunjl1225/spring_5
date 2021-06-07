package com.yun.dao;

import com.yun.dao.Impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 使用 JDK 动态代理，使用 Proxy 类里面的方法创建代理对象
 * @author Yunjl
 * @create 2021-05-20 22:01
 */
public class JDKProxy {
    public static void main(String[] args) {
        //接口
        Class[] interfaces = {UserDao.class};
        //创建接口实现类的代理对象
/*       newProxyInstance方法
            方法有三个参数：
            第一参数，类加载器
            第二参数，增强方法所在的类，这个类实现的接口，支持多个接口
            第三参数，实现这个接口 InvocationHandler，创建代理对象，写增强的部分
           */
//        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
//            @Override       //匿名内部类
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                return null;
//            }
//        });
        //或
        UserDaoImpl userDao = new UserDaoImpl();
        //创建代理对象
        UserDao dao = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDdaoProxy(userDao));

        //调用方法
        int add = dao.add(1, 12);
        System.out.println(add);
        System.out.println("*******");

        String yun = dao.update("yun");
        System.out.println(yun);

    }
}

//创建代理对象的代码
class UserDdaoProxy implements InvocationHandler{

    private Object obj;
    //这里创建的是UserDaoImpl类的代理对象，要把UserDaoImpl传进来
    //通过有参构造传递
    public UserDdaoProxy(Object obj){
        this.obj = obj;
    }



    //对象被创建，方法就会被调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前增强的部分
        System.out.println("方法之前执行。。。。方法名：" + method.getName() + ",传递的参数：" + Arrays.toString(args));

        //执行UserDaoImpl类中的方法(被增强的方法)
        Object res = method.invoke(obj, args);

        //方法之后增强的部分
        System.out.println("方法之后执行" + obj);
        return res;
    }
}