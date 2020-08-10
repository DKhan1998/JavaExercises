package com.qa.Day2;

public class Exercise1 {

    public static int[] NumberOne = {69, 39};
    public static int[] NumberTwo = {7, 3};
    public static double[] NumberThree = {6, 9};

    public static void main(String[] args) {

        multiplication(NumberOne);
        division(NumberThree);
        addition(NumberTwo);

    }

    public static void addition(int[] number){

        int result = number[0] + number[1];
        System.out.println(result);
    }

    public static void multiplication(int[] numbers){

        int result = numbers[0] * numbers[1];
        System.out.println(result);
    }

    public static void division(double[] numbers){

        System.out.println(numbers[0] / numbers[1]);
    }
}
