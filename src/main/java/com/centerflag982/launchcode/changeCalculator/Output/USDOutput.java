package com.centerflag982.launchcode.changeCalculator.Output;

public class USDOutput implements CurrencyOutput{
    public void printCoinAmounts(int[] coinArray){
        System.out.println("Coins received:");
        System.out.println("Dollar Coins: " + coinArray[0]);
        System.out.println("Half Dollars: " + coinArray[1]);
        System.out.println("Quarters: " + coinArray[2]);
        System.out.println("Dimes: " + coinArray[3]);
        System.out.println("Nickels: " + coinArray[4]);
        System.out.println("Pennies: " + coinArray[5]);
    }
}
