package BeanFactoryPostProcesser;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Restaruant restaruant = (Restaruant) context.getBean("beanFactoryPostProcesser");
        restaruant.greetCustomer();
    }
}
