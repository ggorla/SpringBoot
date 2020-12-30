package BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Restaruant restaruant1 = (Restaruant) context.getBean("beanScopeBean");
        restaruant1.setWelcomeNote("Object1 is setting welcome not Property");
        restaruant1.greetCustomer();

        Restaruant restaruant2 = (Restaruant) context.getBean("beanScopeBean");
        restaruant2.greetCustomer();
    }
}
