package InitlizationBeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaruant implements InitializingBean, DisposableBean
{
    public void greetCustomer(){
        System.out.println("Weclome Dear Customer");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Resturent bean is going thriugh after property is set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Resturent bean is Destroying now");
    }
}
