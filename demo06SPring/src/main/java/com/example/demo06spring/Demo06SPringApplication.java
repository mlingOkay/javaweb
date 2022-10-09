package com.example.demo06spring;

import com.example.demo06spring.dao.userDao;
import com.example.demo06spring.entity.stu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo06SPringApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classone = new ClassPathXmlApplicationContext("application.xml");
        stu stu = (com.example.demo06spring.entity.stu) classone.getBean("stu");
        System.out.println(stu);
    }


}
