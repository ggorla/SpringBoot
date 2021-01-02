package ScopePrototypeSingleton;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Prototype {
    private  String dataTime = LocalDateTime.now().toString();
    public String getMethod(){
        return  dataTime;
    }
}
