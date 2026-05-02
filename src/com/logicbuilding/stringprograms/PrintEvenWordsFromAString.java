package com.logicbuilding.stringprograms;

public class PrintEvenWordsFromAString {

    public static void main(String[] args) {
        
        String input = "Sky is vast and blue";
        String dataArray[] = input.split(" ");

        for(String word : dataArray){
            if(word.length() % 2 == 0)
                System.out.println(word);
        }
    }

}
