package com.qa.Day2;

public class Exercise2 {

    public static void main(String[] args) {
        flowchart(467, 6, false);

    }

    public static void flowchart(int numberOne, int numberTwo, boolean result){

        // Exercise1 of  the flowchart section.
        int ResultNumber;

        if(result){
            ResultNumber = numberOne + numberTwo;
        } else {
            ResultNumber = numberOne * numberTwo;
        }
        System.out.println(ResultNumber);

        //Exercise2 of the flowchart section
        if(numberOne > 2000){
            System.out.println("A");
            if(numberOne > 6000){
                System.out.println("C");
            } else {
                System.out.println("B");
                if(numberOne > 4000){
                    System.out.println("D");
                }
                else{
                    System.out.println("E");
                }
            }
        } else {
            System.out.println("1");
            if(numberOne > 100){
                System.out.println("3");
                if(numberOne > 600){
                    System.out.println("5");
                } else {
                    System.out.println("4");
                    if(numberOne > 500){
                        System.out.println("6");
                    } else {
                        System.out.println("7");
                    }
                }
            } else {
                System.out.println("2");
            }
        }
    }
}
