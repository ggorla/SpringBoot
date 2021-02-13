import org.apache.velocity.exception.ResourceNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class ChallengeDaoService {
    public static final double PASS = 87.5;
    private static final List<Challenge> challengeList = new ArrayList<>();
    static {
        challengeList.add(new Challenge("capital of alabama","montgomery",true));
        challengeList.add(new Challenge("capital of alaska","juneau",true));
        challengeList.add(new Challenge("capital of arkansas","little rock",true));
        challengeList.add(new Challenge("capital of arizona","phoenix",true));
        challengeList.add(new Challenge("capital of california","sacramento",true));
        challengeList.add(new Challenge("capital of colorado","denver",true));
        challengeList.add(new Challenge("capital of connecticut","hartford",true));
        challengeList.add(new Challenge("capital of delaware","dover",true));
        challengeList.add(new Challenge("capital of newyork","albany",true));
        challengeList.add(new Challenge("capital of new jersey","trinton",true));
        challengeList.add(new Challenge("capital of florida","tallahassee",true));
        challengeList.add(new Challenge("capital of georgia","atlanta",true));
        challengeList.add(new Challenge("capital of illinois","springfield",true));
        challengeList.add(new Challenge("capital of new jersey","tom river",false));
        challengeList.add(new Challenge("capital of hawaii","honolulu",true));
        challengeList.add(new Challenge("capital of idaho","boise",true));
    }

/*
    This function takes list of challenges and compare
    with the master challenge list to get the pass percentage
    If answerd list size less than 87.5% of master list - returns false
    if correct answered challengs is less than 87.5 - return false
 */
    public boolean isPassing(List<Challenge> challengeAnsweredlist) throws Exception {
        int answeredListSize = challengeAnsweredlist.size();
        int actualListSize = challengeList.size();
        int correctAnswersCounter  = 0;
        //getting the percentage of answered vs actual
        double percentage = calculatePercentage(answeredListSize,actualListSize);
        //throwing if execption if list is empty
        if(challengeAnsweredlist.isEmpty()){
            throw new NullPointerException("Null");
        }
        //extra check before iterating two list avoiding time complexity
        // if asked list actual size is less than pass percentage no need of iterating return false
        if(percentage>= PASS && answeredListSize<= actualListSize){
            for(Challenge challenge: challengeList){
                for(Challenge challengeAnswered: challengeAnsweredlist){
                    if (challenge.getQuestion().equals(challengeAnswered.getQuestion().toLowerCase()) && challenge.getAnswer().equals(challengeAnswered.getAnswer().toLowerCase())){
                        correctAnswersCounter++;
                    }
                }
            }
            double answerPercentage  = calculatePercentage(correctAnswersCounter,actualListSize);
            //this condition check if the answerd question have more than 87.5% correct
            return answerPercentage >= PASS;
        }
        return false;
    }
    //helper function
    public double calculatePercentage(int askedSize, int actualSize){
        return  askedSize*100.0/ actualSize;
    }
}
