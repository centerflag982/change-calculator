package com.centerflag982.launchcode.changeCalculator;

public class CoinCalculatorEuro implements CoinCalculator{

    private int coinAmounts[] = new int[]{0,0,0,0,0,0,0,0}; //dollar, half dollar, quarter, dime, nickels, pennies

    public int[] calculateChange(String amountOfChange) {
        int euroCentAmount = Integer.parseInt(amountOfChange.substring(amountOfChange.length() - 2));
        int euroAmount = Integer.parseInt(amountOfChange.substring(1, amountOfChange.length() - 3));

        while (euroAmount >= 2){
            coinAmounts[0]++;
            euroAmount -= 2;
        }

        while (euroAmount >= 1){
            coinAmounts[1]++;
            euroAmount -= 1;
        }

        while (euroCentAmount >= 50){
            coinAmounts[2]++;
            euroCentAmount -= 50;
        }

        while (euroCentAmount >= 20){
            coinAmounts[3]++;
            euroCentAmount -= 20;
        }

        while (euroCentAmount >= 10){
            coinAmounts[4]++;
            euroCentAmount -= 10;
        }

        while (euroCentAmount >= 5){
            coinAmounts[5]++;
            euroCentAmount -= 5;
        }

        while (euroCentAmount >= 2){
            coinAmounts[6]++;
            euroCentAmount -= 2;
        }

        while (euroCentAmount >= 1){
            coinAmounts[7]++;
            euroCentAmount -= 1;
        }

        return coinAmounts;
    }
}
