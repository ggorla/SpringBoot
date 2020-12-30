package BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaruant {
    public void greetCustomer(){
        System.out.println("Welcome dear customer");
    }
    @PostConstruct
    public void init(){
        System.out.println("Restaruant Bean is going throug init");
    }

    @PreDestroy
    public  void destroy(){
        System.out.println("Bean will destroy now");
    }
}
