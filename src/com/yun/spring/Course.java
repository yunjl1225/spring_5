package com.yun.spring;

/**
 * 课程类
 * @author Yunjl
 * @create 2021-05-20 11:11
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }

}
