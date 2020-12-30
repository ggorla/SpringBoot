package DICollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("SpringConfig.xml");
        Resturant resturant = (Resturant) context.getBean("restaruantBean");
        resturant.displayWaitersName();
    }
}
