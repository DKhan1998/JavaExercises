package com.qa.day5;


public class Challenge1 {

    public static void main(String[] args) {
        // My solution
        cypher("wizard");
        decipher("gsrh rh zm vcznkov lu gsv zgyzhs xrksvi");
        //brokenKeyboard();
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

    private static void decipher(String cipheredText) {

        String decodedText = "";
        cipheredText = cipheredText.toLowerCase();
        for (char c : cipheredText.toCharArray()) {
            if (Character.isLetter(c)) {
                decodedText += (char) ('z' + ('a' - c));
            } else {
                decodedText += c;
            }
        }
        System.out.println("The decoded message = " + cipheredText);
        System.out.println("The new coded message = " + decodedText);
    }
}
