package com.centerflag982.launchcode.changeCalculator;

import com.centerflag982.launchcode.changeCalculator.Calculators.*;

import java.util.Scanner;

public class UserInterface {

    public String getChangeAmount(){
        Scanner inputReader = new Scanner(System.in);
        boolean validInput = false;
        String changeAmount = "";
        while (!validInput){
            changeAmount = inputReader.nextLine();
            validInput = validateChangeAmount(changeAmount);
        }
        return changeAmount;
    }

    public boolean validateChangeAmount(String changeAmount){
        //String changeAmount = inputReader.nextLine();
        boolean dataValid = true;
        try{
            Integer.parseInt(changeAmount.substring(changeAmount.length() - 2));
            Integer.parseInt(changeAmount.substring(1, changeAmount.length() - 3));
            assert changeAmount.substring(0,1).equals("$") || changeAmount.substring(0,1).equals("€");
        }
        catch (Exception e) {
            //System.out.println(e);
            System.out.println("Input invalid. Please check and re-enter.");
            dataValid = false;
        }
        return dataValid;
    }

    public CoinCalculator getCalculatorType(String changeString){
        CoinCalculator calcType;
        switch (changeString.substring(0,1)){
            case "$": calcType = new CoinCalculatorUSD();
                        break;
            case "€": calcType = new CoinCalculatorEuro();
                        break;
            default: throw new RuntimeException("switch somehow received bad currency value; defaulting to USD");
        }
        return calcType;
    }
}
