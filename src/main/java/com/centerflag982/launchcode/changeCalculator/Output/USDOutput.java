package com.centerflag982.launchcode.changeCalculator.Output;

import java.util.Arrays;
import java.util.List;

public class USDOutput implements CurrencyOutput{

    private List<String> singularNames = Arrays.asList("Dollar coin", "Half-dollar", "Quarter", "Dime", "Nickel", "Penny");
    private List<String> pluralNames = Arrays.asList("Dollar coins", "Half-dollars", "Quarters", "Dimes", "Nickels", "Pennies");

    public void printCoinAmounts(int[] coinArray){
        System.out.println("Coins received:");
        for (int i = 0; i < coinArray.length; i++) {
            switch (coinArray[i]){
                case 0:
                    break;
                case 1:
                    System.out.println(coinArray[i] + " " + singularNames.get(i));
                    break;
                default:
                    System.out.println(coinArray[i] + " " + pluralNames.get(i));
                    break;
            }

        }
    }
}
