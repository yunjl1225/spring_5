package com.yun.autowire;

/**
 * 演示自动装配
 * 员工类
 * @author Yunjl
 * @create 2021-05-20 16:42
 */
public class Employees {
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "department=" + department +
                '}';
    }

    public void test(){
        System.out.println(department);
    }
}
