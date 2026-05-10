package com.logicbuilding.javaprograms;

public class PatternPrinting {

    public static void main(String[] args) {
        
        int number = 5;

        for(int row = 1; row<=number; row++){
            for(int col = 1; col <=row; col++){
                System.out.print(col);
            }
            System.out.println("");
        }
    }

}
