package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class ISBNValidateTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void appendCheckDigitToISBN12Test1() {
        String ISBN12 = "978030640615";
        String expected = "9780306406157";
        assertEquals(expected, ISBNValidate.appendCheckDigitToISBN12(ISBN12));
    }

    @Test
    public void appendCheckDigitToISBN12Test2() {
        String ISBN12 = "000000000000";
        String expected = "0000000000000";
        assertEquals(expected, ISBNValidate.appendCheckDigitToISBN12(ISBN12));
    }

    @Test
    public void appendCheckDigitToISBN12Test3() {
        String ISBN12 = "999999999999";
        String expected = "9999999999994";
        assertEquals(expected, ISBNValidate.appendCheckDigitToISBN12(ISBN12));
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test4() {
        String ISBN12 = "978021";
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test5() {
        String ISBN12 = "11111111111111";
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test6() {
        String ISBN12 = "97A030640615";
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test7() {
        String ISBN12 = "97-030640615";
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test8() {
        String ISBN12 = "";
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }

    @Test(expected = IllegalArgumentException.class)
    public void appendCheckDigitToISBN12Test9() {
        String ISBN12 = null;
        ISBNValidate.appendCheckDigitToISBN12(ISBN12);
    }






}
