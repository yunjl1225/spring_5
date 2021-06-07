package com.yun.bean;

/**
 * 员工类
 * @author Yunjl
 * @create 2021-05-19 23:45
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使用对象形式表示
    private Dept dept;
    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename + "::" + gender + "-" + dept.getDname() +";调用dept的toString方法："+ dept);
//        调用dept类的方法
        dept.show();
    }
}
