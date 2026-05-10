package com.logicbuilding.javaprograms;

public class PatternPrintingHollowPrinting {

    public static void main(String[] args) {
        
        int totalRows = 5;

        for(int row = 1; row <= totalRows; row++){
            for(int col = 1; col <= row; col++){
                if((col == 1 || col == row) || row == totalRows){
                    System.out.print(col);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}
