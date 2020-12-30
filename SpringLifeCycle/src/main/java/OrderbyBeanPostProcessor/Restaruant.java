package OrderbyBeanPostProcessor;

public class Restaruant {
    public void greetMessage(){
        System.out.println("Inside the resturent ");
    }
    public void init(){
        System.out.println("Restaruant Bean is going throug init");
    }
    public void destroy(){
        System.out.println("Restaruant Bean is going throug init");
    }
}
