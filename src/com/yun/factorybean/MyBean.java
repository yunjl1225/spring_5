package com.yun.factorybean;

import com.yun.spring.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂 bean（FactoryBean）
 * @author Yunjl
 * @create 2021-05-20 15:19
 */
public class MyBean implements FactoryBean<MyBean>{
    /**
     * 定义返回bean对象的类型，默认是Object
     * @return
     * @throws Exception
     */
    @Override
    public MyBean getObject() throws Exception {
        MyBean myBean = new MyBean();
        return myBean;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 是否是单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
