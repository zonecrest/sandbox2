package com.zonecrest;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void testConcatAndConvertString() throws Exception {
        String expectedValue="HELLOWORLD";
        App app=new App();
        String actualValue=app.concatAndConvertString("Hello", "World");
        assertEquals(expectedValue, actualValue);
    }
}
