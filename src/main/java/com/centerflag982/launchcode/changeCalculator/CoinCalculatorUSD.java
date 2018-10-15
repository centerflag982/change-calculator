package com.centerflag982.launchcode.changeCalculator;

public class CoinCalculatorUSD implements CoinCalculator{

    private int coinAmounts[] = new int[]{0,0,0,0,0,0}; //dollar, half dollar, quarter, dime, nickels, pennies

    public int[] calculateChange(String amountOfChange) {
        int changeAmount = Integer.parseInt(amountOfChange.substring(amountOfChange.length() - 2));
        coinAmounts[0] = Integer.parseInt(amountOfChange.substring(1, amountOfChange.length() - 3));

        while (changeAmount > 50){
            coinAmounts[1]++;
            changeAmount -= 50;
        }

        while (changeAmount > 25){
            coinAmounts[2]++;
            changeAmount -= 25;
        }

        while (changeAmount > 10){
            coinAmounts[3]++;
            changeAmount -= 10;
        }

        while (changeAmount > 5){
            coinAmounts[4]++;
            changeAmount -= 5;
        }

        while (changeAmount > 1){
            coinAmounts[5]++;
            changeAmount -= 1;
        }

        //int[] coinAmounts = new int[]{dollarCoins,halfDollars,quarters,dimes,nickels,pennies};

        return coinAmounts;
    }
}
