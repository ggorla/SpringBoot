package com.seleniumexpress.di;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/applicationcontext.xml");
        System.out.println("beans.xml file loaded");
        context.getBean("stu", Student.class);
        Student.cheating();
    }
}
