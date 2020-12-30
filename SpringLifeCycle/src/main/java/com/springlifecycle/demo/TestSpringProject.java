package com.springlifecycle.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Restaruant restaruantObj = (Restaruant) context.getBean("restaruantBean");
        restaruantObj.prepareHotDrink();
    }
}
