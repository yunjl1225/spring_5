package com.yun.spring;

/**
 * 演示通过spring使用有参构造器方法进行注入属性
 * @author Yunjl
 * @create 2021-05-19 20:39
 */
public class Orders {
    //1、创建属性
    private String oname;
    private String address;
    //2、生成有参构造器
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    //3、设置配置文件bean1.xml

    /**
     * 用于显示属性值
     */
    public void show(){
        System.out.println("oname值为:" + oname);
        System.out.println("address值为:" + address);
    }
}
