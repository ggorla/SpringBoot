import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        //quicly creating the objects and adding to list for isPassing function
        ChallengeDaoService service = new ChallengeDaoService();
        Challenge challengeAnswered1 = new Challenge("capital of alabama","montgomery",true);
        Challenge challengeAnswered2 = new Challenge("capital of alaska","juneau",true);
        Challenge challengeAnswered3 = new Challenge("capital of arkansas","little rock",true);
        Challenge challengeAnswered4 = new Challenge("capital of arizona","phoenix",true);
        Challenge challengeAnswered5 = new Challenge("capital of california","sacramento",true);
        Challenge challengeAnswered6 = new Challenge("capital of colorado","denver",true);
        Challenge challengeAnswered7 = new Challenge("capital of connecticut","hartford",true);
        Challenge challengeAnswered8 = new Challenge("capital of delaware","dover",true);
        Challenge challengeAnswered9 = new Challenge("capital of newyork","albany",true);
        Challenge challengeAnswered10 = new Challenge("capital of new jersey","trinton",true);
        Challenge challengeAnswered11 = new Challenge("capital of florida","tallahassee",true);
        Challenge challengeAnswered12 = new Challenge("capital of georgia","atlanta",true);
        Challenge challengeAnswered13 = new Challenge("capital of illinois","springfield",true);
        Challenge challengeAnswered14 = new Challenge("capital of new jersey","tom river",false);

        List<Challenge> challengeAnsweredlist = new ArrayList<>();

        boolean result = service.isPassing(challengeAnsweredlist);
        System.out.println("The results of the Challenge: " + result);

    }
}
