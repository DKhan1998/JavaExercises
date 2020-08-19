package com.qa.day7;

public class MorseCode {

    public static void main(String[] args) {
        System.out.println(decodeMorseToEnglish("- -"));
        System.out.println(decodeMorseToEnglish(". ."));
        System.out.println(decodeMorseToEnglish(".. .. .. / .. .. .."));
        System.out.println(decodeMorseToEnglish(" "));
        System.out.println(decodeMorseToEnglish("/"));
        System.out.println(decodeMorseToEnglish("."));
        System.out.println(decodeMorseToEnglish(". . ."));
    }

    public static String[] alphabetMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};
    public static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', ' '};

    public static String encodeEnglishToMorse(String english) {
        String encryptedString = english.toLowerCase();
        String outString = "";
        char[] encryptedStringAsCharArray = encryptedString.toCharArray();
        for (char c : encryptedStringAsCharArray) {
            for (int a = 0; a < alphabet.length; a++) {
                if (c == alphabet[a]) {
                    outString += (alphabetMorse[a]);
                }
            }
        }
        return outString;
    }
    public static int longestMorseCode(String[] morseAlphabet){
        int maxLength = 0;
        for(String s: morseAlphabet){
            if(s.length() > maxLength){
                maxLength = s.length();
            }
        }
        return maxLength;
    }
    public static String decodeMorseToEnglish(String morse) {
        String output = ""; // -
        String[] singleWords = morse.split(" "); // more = .. .. .. / .. .. .. -> ["..","..","..","/","..","..",".."]
        //System.out.println(Arrays.toString(singleWords));
        for(String s: singleWords){
            output += singleLetterMorseToEnglish(s);
        }
        return output;
    }
    public static String singleLetterMorseToEnglish(String morse) {
        String[][] englishToMorseMap = {{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "}, {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--..",
                "/",
        }};
        String output = "";
        //".." == ".."
        for (int j = 0; j < englishToMorseMap[1].length; j++) {
                /*System.out.println(morse.substring(i, i + 1).equals(englishToMorseMap[1][j]));
                System.out.print("MORSE " + morse.substring(i, i + 1) + "\n");
                System.out.println("MORSE MAP: " + englishToMorseMap[1][j] + "\n\n");
                */
            if (morse.equals(englishToMorseMap[1][j])) {
                //System.out.print("Hit");
                output += englishToMorseMap[0][j];
                break;
            }
        }
        return output.toUpperCase();
    }
}