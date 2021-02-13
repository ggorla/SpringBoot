import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ChallengeDaoService {
    private static List<Challenge> challengeList = new ArrayList<>();
    static {
        challengeList.add(new Challenge("capital of newyork","albany",true));
        challengeList.add(new Challenge("capital of new jersey","trinton",true));
        challengeList.add(new Challenge("capital of new jersey","tom river",false));
    }

    public boolean isPassing(Challenge challengeQuestion) {

        if (challengeList != null) {
            for (Challenge challenge : challengeList) {
                if (challenge.getQuestion() == challengeQuestion.getQuestion().toLowerCase() && challenge.getAnswer() == challengeQuestion.getAnswer().toLowerCase()){
                    return  challenge.isCorrect();
                }
            }
        }
        return false;
    }
}
