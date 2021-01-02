package ApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApplicationContextTutorialApplication implements CommandLineRunner{

   //This is one way to create Applciationcontact via ApplicationContactAware interfac
   /* 1  @Autowired
    private ApplicationContextProvider applicationContextProvider;
    */
    //2nd way
    private ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationContextTutorialApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        /* 1
        Message message = applicationContextProvider.getApplicationContext().getBean(Message.class);
        */

        //2nd way
        Message message = applicationContext.getBean(Message.class);
        System.out.println(message.greeatMessage());

    }
}
