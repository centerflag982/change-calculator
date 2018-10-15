package com.centerflag982.launchcode.changeCalculator.Output;

import java.util.Arrays;
import java.util.List;

public class EuroOutput implements CurrencyOutput{

    private List<String> singularNames = Arrays.asList("Two-Euro", "One-Euro", "50 Euro Cent", "20 Euro Cent", "10 Euro Cent", "5 Euro Cent", "2 Euro Cent", "1 Euro Cent");
    private List<String> pluralNames = Arrays.asList("Two-Euros", "One-Euros", "50 Euro Cents", "20 Euro Cents", "10 Euro Cents", "5 Euro Cents", "2 Euro Cents", "1 Euro Cents");

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
