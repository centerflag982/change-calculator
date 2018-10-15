package com.centerflag982.launchcode.changeCalculator.Output;

public class EuroOutput implements CurrencyOutput{
    public void printCoinAmounts(int[] coinArray){
        System.out.println("Coins received:");
        System.out.println("Two-Euro: " + coinArray[0]);
        System.out.println("One-Euro: " + coinArray[1]);
        System.out.println("50 Eurocent: " + coinArray[2]);
        System.out.println("20 Eurocent: " + coinArray[3]);
        System.out.println("10 Eurocent: " + coinArray[4]);
        System.out.println("5 Eurocent: " + coinArray[5]);
        System.out.println("2 Eurocent: " + coinArray[6]);
        System.out.println("1 Eurocent: " + coinArray[7]);
    }
}
