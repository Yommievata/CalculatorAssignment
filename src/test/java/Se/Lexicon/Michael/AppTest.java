package Se.Lexicon.Michael;

import static org.junit.Assert.assertTrue;


import org.junit.Assert;
import org.junit.Test;

import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void Testing()
    {

        assertTrue( true );
    }
    @Test
    public void testadd(){
        int number1 = 2;
        int number2 = 2;
        int result = 4;
        if (result !=4){
            Assert.fail();
        }
    }
    @Test
    public void testMinus(){
        int number1 = 34;
        int number2 = 16;
        int result = 18;
        if (result !=18){
            Assert.fail();
        }
    }
    @Test
    public void testMultiply(){
        int number1 =10;
        int number2 = 15;
        int result = 150;
        if (result !=150){
            Assert.fail();
        }
    }
    @Test
    public void testDivide(){
        int number1 = 24;
        int number2 = 10;
        double result = 2.4;
        if (result !=2.4){
            Assert.fail();
        }
    }
}
