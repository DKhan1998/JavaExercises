package com.qa.day2;

public class Exercise1 {

    public static int[] NumberOne = {69, 39};
    public static int[] NumberTwo = {7, 3};
    public static double[] NumberThree = {6, 9};

    public static void main(String[] args) {

        multiplication(NumberOne);
        division(NumberThree);
        addition(NumberTwo);

    }

    public static Integer addition(int[] number){
        int result = number[0] * number[1];
        System.out.println(result);
        return number[0] + number[1];
    }

    public static Integer multiplication(int[] numbers){

        int result = numbers[0] * numbers[1];
        System.out.println(result);
        return result;
    }

    public static Double division(double[] numbers){

        double result = numbers[0] / numbers[1];
        System.out.println(result);
        return result;
    }
}
