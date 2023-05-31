package com.demo.project;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//RunAll

public class RunnerTest {

    @BeforeMethod
    public void setUp()
    {
        System.out.println("running the setUp");
    }


    @Test
    //Run | Debug
    public void Sum1ReturnCorrectResult()
    {
        final int number1=3;
        final int number2=5;
        final int expected=8;

        final int actual=Runner.sum(number1,number2);
//assertEquals(expected,actual);
      //  assertEquals(expected-1,actual);
        Assert.assertEquals(expected,actual);
    }

   public void Sum2ReturnCorrectResult()
    {
        final int number1=1;
        final int number2=2;
        final int expected=3;
        final int actual=Runner.sum(number1,number2);
        assert expected==actual;

    }
@AfterMethod
    public void tearDown()
    {
        System.out.println("running the tearDown");

    }
}
