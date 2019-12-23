package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int fisrstmaxLengsWord = 0;
        int secondmaxLengsWord = 0;
        String word=null;
        String text1 = null;
        String text2 = null;
        int wordLengs = 0;

        BufferedReader inputStreamWord = null;
        try {
            inputStreamWord = new BufferedReader(new FileReader(
                    "C:/Users/julia/Desktop/Test/src/com/company/words.txt"));
            while ((word = inputStreamWord.readLine()) != null) {
                wordLengs = word.length();

                if (wordLengs > fisrstmaxLengsWord) {
                    fisrstmaxLengsWord = wordLengs;
                    text1 = word;
                } else if (wordLengs > secondmaxLengsWord) {
                    secondmaxLengsWord = fisrstmaxLengsWord;
                    text2 = word;
                }
            }
            }
        finally {
            if (inputStreamWord !=null){
                inputStreamWord.close();
            }
        }
        System.out.println("Max length of word first = " + fisrstmaxLengsWord);
        System.out.println("Max word first = "+ text1);
        System.out.println("Max length of word second = " + secondmaxLengsWord);
        System.out.println("Max word one second = "+ text2);

    }
}
