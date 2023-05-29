package com.demo.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
public class Runner5Test {

    @BeforeEach
    public void setUp()
    {
        System.out.println("running the setUp");
    }
    @Test
    public void Sum1ReturnCorrectResult()
    {
        final int number1=3;
        final int number2=5;
        final int expected=8;

        final int actual=Runner.sum(number1,number2);
assertEquals(expected,actual);
      //  assertEquals(expected-1,actual);
    }

    @Test
    public void Sum2ReturnCorrectResult()
    {
        final int number1=1;
        final int number2=2;
        final int expected=3;
        final int actual=Runner.sum(number1,number2);
        assert expected==actual;

    }
    @AfterEach
    public void tearDown()
    {
        System.out.println("running the tearDown");

    }
}
