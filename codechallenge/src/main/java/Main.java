import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ChallengeDaoService service = new ChallengeDaoService();
        if(service!=null){
            Challenge challengeAsked = new Challenge("capital of new jersey","trinton",false);
            boolean result  = service.isPassing(challengeAsked);
            System.out.println("The results of the Challenge: "+result);
        }
        else{
            System.out.println("Please check back there are no challenges at this point");
        }

    }
}
