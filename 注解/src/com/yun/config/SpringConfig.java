package com.yun.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 完全注解开发
 * 配置类，替代 xml 配置文件
 * @author Yunjl
 * @create 2021-05-20 19:32
 */
@Configuration      //设置为配置类，替代 xml 配置文件
@ComponentScan(basePackages = {"com.yun"})      //开启组件扫描
public class SpringConfig {
}
