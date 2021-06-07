package com.yun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 使用完全注解方式实现aop增强
 * 配置类
 * @author Yunjl
 * @create 2021-05-21 10:51
 */
@Configuration          //设置完全注解
@ComponentScan(basePackages = "com.yun")        //开启扫描
@EnableAspectJAutoProxy(proxyTargetClass = true )       //开启Aspect生成代理对象
public class ConfigAop {
}
