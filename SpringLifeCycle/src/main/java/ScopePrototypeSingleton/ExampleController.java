package ScopePrototypeSingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ExampleController {
    @Autowired
    private Singleton singleton;

    @GetMapping("/v1/example")
    public List<String> getMethod() throws  InterruptedException{
        String first = singleton.getMethod();
        Thread.sleep(1000);
        String second = singleton.getMethod();
        return Arrays.asList(first, second);
    }
}
