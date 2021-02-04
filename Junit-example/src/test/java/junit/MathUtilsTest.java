package junit;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    public void init()
    {
        mathUtils = new MathUtils();
    }
    @Test
    public void testadd(){
       MathUtils mathUtils= new MathUtils();
       int expcted =2;
       int actual = mathUtils.add(1,1);
       assertEquals(expcted,actual);
    }

    @Test
    public void testComputeCircleRadious(){
        MathUtils mathUtils= new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCericelArea(10),"compute math circle");
    }

    @Test
    public void testDivide(){
        MathUtils mathUtils= new MathUtils();
        assertThrows(ArithmeticException.class,()->mathUtils.divide(4,2),"THe method should add two numbers");
        mathUtils.divide(1,0);
    }

}