import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ChallengeServiceTest {
    List<Challenge> challengeAnsweredlist = new ArrayList<>();


    @Test
    public void testIsPassing() throws Exception {
        ChallengeDaoService challenge = new ChallengeDaoService();
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


        challengeAnsweredlist.add(challengeAnswered1);
        challengeAnsweredlist.add(challengeAnswered2);
        challengeAnsweredlist.add(challengeAnswered3);
        challengeAnsweredlist.add(challengeAnswered4);
        challengeAnsweredlist.add(challengeAnswered5);
        challengeAnsweredlist.add(challengeAnswered6);
        challengeAnsweredlist.add(challengeAnswered7);
        challengeAnsweredlist.add(challengeAnswered8);
        challengeAnsweredlist.add(challengeAnswered9);
        challengeAnsweredlist.add(challengeAnswered10);
        challengeAnsweredlist.add(challengeAnswered11);
        challengeAnsweredlist.add(challengeAnswered12);
        challengeAnsweredlist.add(challengeAnswered13);
        challengeAnsweredlist.add(challengeAnswered14);

        boolean isResult = challenge.isPassing(challengeAnsweredlist);
        Assert.assertTrue("Test case testIsPassing() fails",isResult);
    }

    //Test if the percentage is less than 87.5%
    // couple of capital and flags are marked as wrong for test
    @Test
    public void testIsNotPassing() throws Exception {
        ChallengeDaoService challenge = new ChallengeDaoService();

        Challenge challengeAnswered1 = new Challenge("capital of alabama","test",true);
        Challenge challengeAnswered2 = new Challenge("capital of alaska","test1",false);
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
        Challenge challengeAnswered14 = new Challenge("capital of new jersey","tom river",true);


        challengeAnsweredlist.add(challengeAnswered1);
        challengeAnsweredlist.add(challengeAnswered2);
        challengeAnsweredlist.add(challengeAnswered3);
        challengeAnsweredlist.add(challengeAnswered4);
        challengeAnsweredlist.add(challengeAnswered5);
        challengeAnsweredlist.add(challengeAnswered6);
        challengeAnsweredlist.add(challengeAnswered7);
        challengeAnsweredlist.add(challengeAnswered8);
        challengeAnsweredlist.add(challengeAnswered9);
        challengeAnsweredlist.add(challengeAnswered10);
        challengeAnsweredlist.add(challengeAnswered11);
        challengeAnsweredlist.add(challengeAnswered12);
        challengeAnsweredlist.add(challengeAnswered13);
        challengeAnsweredlist.add(challengeAnswered14);

        boolean isResult = challenge.isPassing(challengeAnsweredlist);
        Assert.assertFalse("Test case testIsNotPassing() fails",isResult);
    }

    @Test
    public void testForSize() throws Exception {
        ChallengeDaoService challenge = new ChallengeDaoService();

        Challenge challengeAnswered1 = new Challenge("capital of alabama","test",true);
        Challenge challengeAnswered2 = new Challenge("capital of alaska","test1",false);
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
        Challenge challengeAnswered14 = new Challenge("capital of new jersey","tom river",true);
        Challenge challengeAnswered15 = new Challenge("capital of georgia","atlanta",true);
        Challenge challengeAnswered16 = new Challenge("capital of illinois","springfield",true);
        Challenge challengeAnswered17 = new Challenge("capital of new jersey","tom river",true);


        challengeAnsweredlist.add(challengeAnswered1);
        challengeAnsweredlist.add(challengeAnswered2);
        challengeAnsweredlist.add(challengeAnswered3);
        challengeAnsweredlist.add(challengeAnswered4);
        challengeAnsweredlist.add(challengeAnswered5);
        challengeAnsweredlist.add(challengeAnswered6);
        challengeAnsweredlist.add(challengeAnswered7);
        challengeAnsweredlist.add(challengeAnswered8);
        challengeAnsweredlist.add(challengeAnswered9);
        challengeAnsweredlist.add(challengeAnswered10);
        challengeAnsweredlist.add(challengeAnswered11);
        challengeAnsweredlist.add(challengeAnswered12);
        challengeAnsweredlist.add(challengeAnswered13);
        challengeAnsweredlist.add(challengeAnswered14);
        challengeAnsweredlist.add(challengeAnswered15);
        challengeAnsweredlist.add(challengeAnswered16);
        challengeAnsweredlist.add(challengeAnswered17);

        boolean isResult = challenge.isPassing(challengeAnsweredlist);
        Assert.assertFalse("Test case testForSize() fails",isResult);
    }

    @Test(expected = NullPointerException.class)
    public void testNullList() throws Exception {
        ChallengeDaoService challenge = new ChallengeDaoService();
        boolean isResult = challenge.isPassing(challengeAnsweredlist);
        Assert.assertFalse("Test case testNullList() fails",isResult);
        
    }

}
