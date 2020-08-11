package com.qa.Day3;

public class Exercise1 {

    public static void main(String[] args) {

        exercise1(100);
        exercise2(100);
    }

    public static void exercise1(int a ){

        while(a < 200){
            System.out.println(a);
            a++;
        }
    }

    public static void exercise2(int a){
        do {
            if (a % 2 == 0) {
                System.out.println("-");
            } else {
                System.out.println("*");
            }
            a++;
        }while(a<=200);
    }
}
