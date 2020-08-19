package com.qa.day6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class BrokenKeyboard {

    public static List<String> foundWords = new ArrayList<>();

    public static void main(String[] args) {
        String[] workingKeys = {"abcd", "zyav", "hjklo"};
        // FInd the file and print out the lines in the file
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/qa/day6/enable1.txt"))) {
            System.out.println("File can be read ! ");
            method1(workingKeys, br);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }

    public static void loopCombination(String[] input, BufferedReader file) throws IOException {

        // controls the number of words to accept
        int maxWords = 0;
        // tracks the amount of chars found within the txt file line
        int foundChars = 0;
        String line;
        Boolean[] foundChar;

        // Loop through individual lines in the input array
        while ((line = file.readLine()) != null){
            System.out.println("---------------------------------------------------");
            System.out.println("Text Line Loop, Reading line " + line);
                // loop through each line in the input
            for (String workingKeys : input) {
                System.out.println("---------------------------------------------------");
                System.out.println("Loop one (input string): " + workingKeys);
                // The number of keys to be inputted
                foundChar = new Boolean[workingKeys.length()];
                // check if we have a max of 5 words per input
                if (maxWords <= 5) {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Does input string contain 5 words? " + maxWords);
                    // loop through each character in the input array string
                    for (char inputChar : workingKeys.toCharArray()) {
                        System.out.println("---------------------------------------------------");
                        System.out.println("Loop three (looped character from user input) : " + inputChar);
                        // check to see if character already has been checked
                        // loop though each character on the given line
                        for (char lineChar : line.toCharArray()) {
                            System.out.println("---------------------------------------------------");
                            System.out.println("Loop four (looped character from text file line)  = " + lineChar);
                            // check if looped characters are equal
                            if (inputChar == lineChar && foundChars < workingKeys.length()) {
                                System.out.println("---------------------------------------------------");
                                System.out.println("New character found to match  = " + inputChar);
                                foundChars++;
                                System.out.println("Added new character to foundChar  = " + foundChars);

                                break;
                            } else if(foundChar[workingKeys.length()]) {
                                maxWords++;
                                System.out.println("Added new wordCount to maxWords, new value  = " + maxWords);
                                foundWords.add(line);
                                System.out.println("New word added : " + foundWords);
                            } else {
                                System.out.println("---------------------------------------------------");
                                System.out.println("NO MATCH !!");
                            }
                        }
                    }
                } else {
                    System.out.println("---------------------------------------------------");
                    System.out.println("Number of matches found is larger than 5!");
                    foundChars = 0;
                    maxWords = 0;
                }
                foundChars = 0;
            }
        }

        // print out all possible combinations
        System.out.println("All possible words are : ");
        for (String avlWord : foundWords){
            System.out.println(avlWord);
        }
    }

    // loop each line of text file
    // text file -> abcd
    public static void method1(String[] input, BufferedReader dictionary) throws IOException {

        String line;

        // loop through the input strings
        for(String inputString : input) {
            // Loop through individual lines in the file
            while ((line = dictionary.readLine()) != null) {
                //
                for (char lineChar : inputString.toCharArray()) {
                    //
                    if (line.toCharArray().equals(lineChar)) {
                        System.out.println("Added new line = " + line);
                        foundWords.add(line);
                        System.out.println("New word added : " + foundWords);
                    }
                }
            }
        }
    }
}
