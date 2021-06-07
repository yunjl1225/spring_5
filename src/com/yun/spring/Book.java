package com.yun.spring;

/**
 * 演示通过spring使用set方法进行注入属性
 * @author Yunjl
 * @create 2021-05-19 20:06
 */
public class Book {
    //1、创建属性
    private String bName;
    private String bauthor;
    private String address;
    private String price;

    //2、创建属性对应的set方法
    public void setbName(String bName) {
        this.bName = bName;
    }
    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPrice(String price) {
        this.price = price;
    }

    //3、设置配置文件bean1.xml

    /**
     * 用于显示属性值
     */
    public void show(){
        System.out.println("bName值为:" + bName);
        System.out.println("bauthor值为:" + bauthor);
        System.out.println("address值为:" + address);
        System.out.println("price值为:" + price);
    }

}
