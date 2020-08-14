package com.qa.day6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class BrokenKeyboard {

    public static List<String> foundWords = new ArrayList<String>();

    public static void main(String[] args) {
        String[] workingKeys = {"abcd", "qwer", "hjklo"};
        // FInd the file and print out the lines in the file
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/qa/day6/enable1.txt"))) {
            System.out.println("File can be read ! ");
            loopCombination(workingKeys, br);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }

    public static void loopCombination(String[] input, BufferedReader file) throws IOException {

        int maxWords;
        int foundChars;
        boolean[] charsFound;
        boolean allCharFound;

        // loop until all characters from input array have been found before moving on
        String line;
        // loop through each line in the text file
        while ((line = file.readLine()) != null) {
            System.out.println("Current Line Loop : " + line);
            // Loop through individual string in the input array
            for (String brokenKeys : input) {
                maxWords = 0;
                System.out.println("Loop one (input string): " + brokenKeys);
                // repeat process until found all words containing all characters
                if(maxWords < brokenKeys.length()){
                    foundChars = 0;
                    charsFound = new boolean[brokenKeys.length()];
                    System.out.println("Loop two (condition) = " + Arrays.toString(charsFound));
                    // loop through each character in the input array string
                    for (char inputChar : brokenKeys.toCharArray()) {
                        System.out.println("Loop three (looped character) : " + inputChar);
                        // check to see if character already has been checked
                        // loop though each character on the given line
                        for (char lineChar : line.toCharArray()) {
                            // check if looped characters are equal
                            if (inputChar == lineChar) {
                                charsFound[foundChars] = true;

                                System.out.println(inputChar + " becomes : " + line);
                                System.out.println("number of chars found : " + charsFound.length);
                                System.out.println("character found : " + Arrays.toString(charsFound));
                            }
                            else charsFound[foundChars] = false;

                        }
                        for (boolean check : charsFound) {
                            if (check) {
                                foundChars++;
                            }
                        }
                        maxWords++;
                    }
                } else {
                    foundWords.add(line);
                    System.out.println("New word added : " + foundWords);

                }
            }
        }

        // print out all possible combinations
        System.out.println("All possible words are : ");
        for (String avlWord : foundWords){
            System.out.println(avlWord);
        }
    }
}
