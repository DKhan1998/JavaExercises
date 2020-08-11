package com.qa.Day3;

public class Iteration {

    public static void main(String[] args) {

        exercise1(100);
        exercise2(100);
        exercise3();
    }

    // loop from 100 to 199
    public static void exercise1(int a ){

        while(a < 200){
            System.out.println(a);
            a++;
        }
    }

    // loop if statement until a is larger than 200
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

    // loop through each number one to ten and print out the number as many times as the number itself
    public static void exercise3(){

        for(int i = 0; i < 10; i++){
           for(int e = 0; e < i; e++){
               System.out.println(i);
           }
        }
    }
}
