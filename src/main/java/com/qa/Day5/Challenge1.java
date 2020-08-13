package com.qa.Day5;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        // My solution
        cypher("wizard");
        decypher("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi");
    }

    public static void cypher(String decodedString) {
        String cypherText = "";
        decodedString = decodedString.toLowerCase();

        for (char c : decodedString.toCharArray()) {
            if (Character.isLetter(c)) {
                cypherText += (char) ('a' + ('z' - c));
            } else {
                cypherText += c;
            }
        }
        System.out.println("The decoded message = " + decodedString);
        System.out.println("The new coded message = " + cypherText);
    }

    private static void decypher(String cypheredText) {

        String decodedText = "";
        cypheredText = cypheredText.toLowerCase();
        for (char c : cypheredText.toCharArray()) {
            if (Character.isLetter(c)) {
                decodedText += (char) ('z' + ('a' - c));
            } else {
                decodedText += c;
            }
        }
        System.out.println("The decoded message = " + cypheredText);
        System.out.println("The new coded message = " + decodedText);
    }
}
