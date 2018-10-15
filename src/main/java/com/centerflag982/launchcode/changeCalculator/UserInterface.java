package com.centerflag982.launchcode.changeCalculator;

import java.util.Scanner;

public class UserInterface {

    /*
    //---------Singleton implementation----------
    private UserInterface() {}

    private static UserInterface userInterface;
    public static UserInterface getInstance() {
        if (userInterface == null){
            userInterface = new UserInterface();
        }
        return userInterface;
    }
    //-------------------------------------------
    */

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
}
