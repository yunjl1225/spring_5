package com.yun.bean;

/**
 * 演示注入属性-内部 bean
 * 部门类
 *  一对多关系：部门和员工
 * @author Yunjl
 * @create 2021-05-19 23:43
 */
public class Dept {
    private String dname;
    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    public void show(){
        System.out.println("Dept的dname属性:" + dname);
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
