package com.demo.project;


public class RunnerTest {

    public void setUp()
    {
        System.out.println("running the setUp");
    }
    //@Test
    public void testSum1()
    {
        final int number1=3;
        final int number2=5;
        final int expected=8;

        final int actual=Runner.sum(number1,number2);
        assert expected==actual;

    }

  //  @Test
    public void testSum2()
    {
        final int number1=1;
        final int number2=2;
        final int expected=3;
        final int actual=Runner.sum(number1,number2);
        assert expected==actual;

    }
    public void tearDown()
    {
        System.out.println("running the tearDown");

    }
}
