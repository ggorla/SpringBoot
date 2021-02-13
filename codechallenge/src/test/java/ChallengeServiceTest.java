import org.junit.Assert;
import org.junit.Test;

public class ChallengeServiceTest {

    @Test
    public void testIsPassing(){
        ChallengeDaoService challenge = new ChallengeDaoService();
        Challenge challengeAsked = new Challenge("capital of new jersey","trinton",false);
        boolean isResult = challenge.isPassing(challengeAsked);
        Assert.assertTrue("Test case testIsPassing() fails",isResult);
    }

    @Test
    public void testIsNotPassing(){
        ChallengeDaoService challenge = new ChallengeDaoService();
        Challenge challengeAsked = new Challenge("capital of new jersey","tom river",false);
        boolean isResult = challenge.isPassing(challengeAsked);
        Assert.assertFalse("Test case testIsNotPassing() fails",isResult);
    }

}
