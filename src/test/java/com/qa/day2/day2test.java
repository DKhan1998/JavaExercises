package com.qa.day2;

import org.junit.BeforeClass;
import org.junit.Test;

import static com.qa.day2.Exercise1.multiplication;
import static org.junit.Assert.assertEquals;
import static com.qa.day2.Exercise1.division;
import static com.qa.day2.Exercise1.addition;

public class day2test {

    public static int[] NumberOne = {69, 39};
    public static int[] NumberTwo = {7, 3};
    public static double[] NumberThree = {6, 9};

    @Test
    public void multiplicationTest(){
        assertEquals((int) multiplication(NumberOne), 2691);
    }

    @Test
    public void dividingTest(){
        assertEquals(division(NumberThree), 0.6666666666666, 0.6);
    }

    @Test
    public void additionTest(){
        assertEquals((int) addition(NumberTwo), 10);
    }
}
