package com.example.demo06spring.entity;

/**
 * @Author: mlingOkay
 * @CreateTime: 2022-09-28  21:16
 * @Description: TODO
 * @Version: 1.0
 */
public class BeanStaticFactory {
    public BeanStaticFactory() {
        System.out.println("stu实例工厂");
    }

    public  stu createFactory(){
        return new stu();
    }
}
