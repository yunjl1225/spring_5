package com.yun.utils;

import java.util.List;

/**
 * 属性注入公共部分
 * @author Yunjl
 * @create 2021-05-20 11:25
 */
public class BeanUtils {
    private List<String> list;
    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }
}
