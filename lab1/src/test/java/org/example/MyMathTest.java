package org.example;

import org.junit.*;

public class MyMathTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println( "@BeforeClass" );
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println( "@AfterClass" );
    }

    @Before
    public void setUp() throws Exception {
        System.out.println( "@Before" );
    }

    @After
    public void tearDown() throws Exception {
        System.out.println( "@After" );
    }

    @Test
    public void testDivPass() {
        System.out.println( "@Test: testDivPass" );
        int number1 = 6;
        int number2 = 3;
        int expected = 2;
        Assert.assertEquals(expected, MyMath.div(number1, number2));
    }

    @Test
    public void testDivFail() {
        System.out.println( "@Test: testDivFail" );
        int number1 = 6;
        int number2 = 1;
        int expected = 2;
        Assert.assertEquals(expected, MyMath.div(number1, number2));
    }

    @Test
    public void testDivError() {
        System.out.println( "@Test: testDivError" );
        int number1 = 6;
        int number2 = 0;
        int expected = 0;
        Assert.assertEquals(expected, MyMath.div(number1, number2));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivException() {
        System.out.println( "@Test: testDivException" );
        int number1 = 6;
        int number2 = 0;
        MyMath.div(number1, number2);
    }


}
