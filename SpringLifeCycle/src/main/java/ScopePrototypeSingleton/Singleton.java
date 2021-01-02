package ScopePrototypeSingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class Singleton {
    //This creates the scope prototype
    /*
    @Autowired
    private  Prototype prototype;

     */
    @Autowired
    private ApplicationContext applicationContext;
    public String getMethod(){

        return applicationContext.getBean(Prototype.class).getMethod();
        //This creates the scope prototype
       // return prototype.getMethod();
    }
}
