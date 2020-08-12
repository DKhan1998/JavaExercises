package com.qa.Day3;

public class Iteration {

    public static void main(String[] args) {
        exercise1(100);
        exercise2(100);
        exercise3();
        exercise5();
        numbersPrinted();
        exercise6("Hello World");
    }

    // loop from 100 to 199
    public static void exercise1(int a ){
        System.out.println(" ");
        System.out.println("Flowchart 1 exercise :");
        while(a < 200){
            System.out.println(a);
            a++;
        }
    }

    // loop if statement until a is larger than 200
    public static void exercise2(int a){
        System.out.println(" ");
        System.out.println("Flowchart 2 exercise :");
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
        System.out.println(" ");
        System.out.println("loop numbers twice exercise :");
        for(int i = 0; i < 10; i++){
           for(int e = 0; e < i; e++){
               System.out.println(i);
           }
        }
    }

    //printing numbers from int to string ForLoop
    public static void numbersPrinted() {
        System.out.println(" ");
        System.out.println("Post number as text exercise :");
        for(int i = 0; i < 100; i++) {
            loopMechanism(i);
        }
    }

    // Breaks down the number and changes it to
    public static String loopMechanism(int number){
        final String[] Tens = {
                "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety"
        };

        final String[] LowerTwenty = {
                "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen"
        };

        String Overall;

        if (number % 100 < 20) {
            Overall = LowerTwenty[number % 100];
            number /= 100;
        } else {
            Overall = LowerTwenty[number % 10];
            number /= 10;

            Overall = Tens[number % 10] + Overall;
            number /= 10;
        }
        if (number == 0) System.out.println(Overall);
        return Overall;
    }

    public static void exercise5(){
        System.out.println(" ");
        System.out.println("Calculating cost exercise :");
        double cost = 4.26, amount = 20;
        double change = amount - cost;
        System.out.println(change);

        int tmp;
        if(change >= 100)
        {
            tmp = (int) change/100;
            System.out.println (tmp + " £100.00");
            change = change % 100;
        }
        if(change >= 50)
        {
            tmp = (int) change/50;
            System.out.println (tmp + " £50.00");
            change = change % 50;
        }
        if(change >= 20)
        {
            tmp = (int) change/20;
            System.out.println (tmp + " £20.00");
            change = change % 20;
        }
        if(change >= 10)
        {
            tmp= (int) change/10;
            System.out.println (tmp + " £10.00");
            change = change % 10;
        }
        if(change >= 5)
        {
            tmp = (int) change/5;
            System.out.println (tmp + " £5.00");
            change = change % 5;
        }
        if(change >= 1)
        {
            tmp = (int) change;
            System.out.println (tmp + " £1.00");
            change = change % 1;
        }
        if(change >= .5){
            tmp = ((int) (change/ .5));
            System.out.println(tmp + " £0.50");
            change = change % .5;
        }
        if(change >= .2)
        {
            tmp = ((int) (change/.2));
            System.out.println (tmp + " £0.20");
            change = change % .2;
        }
        if(change >= .1)
        {
            tmp = ((int) (change/.1));
            System.out.println (tmp + " £0.10");
            change = change % .1;

        }
        if(amount >= .05)
        {
            tmp = ((int) (change/.05));
            System.out.println (tmp + " £0.05");
            change = change % .05;
        }
        if(change >= .01)
        {
            tmp = ((int) (change/.01));
            System.out.println (tmp + " £0.01");
            change = change % .01;
        }
    }

    /**
     * String manipulation exercises
     *
     */
    public static void exercise6(String args){
        System.out.println(" ");
        System.out.println("String Manipulation exercise :");
        int tmp = args.length();
        System.out.println("Length of string : " + tmp);

        System.out.println("String printed vertically : ");
        for(int i = 0; i < args.length(); i++)
        {
            System.out.println(args.charAt(i));
        }

        System.out.println("String printed vertically : ");
        for(int i = 0; i < args.length(); i++)
        {

            System.out.println(args.charAt(i));
        }
    }
}
