package com.centerflag982.launchcode.changeCalculator;

//import com.centerflag982.launchcode.changeCalculator.CoinCalculatorUSD;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {

    public static void main(String [ ] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Main mainInst = (Main) context.getBean("runInstance");
        mainInst.run();
    }

    private UserInterface userInterface;

    public Main(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    private void run(){
        userInterface.getChangeAmount();
    }

    /*
    private void run() {
        OutputType outputType;
        int inputRows;
        String pyramidString;

        inputRows = pyramidBuilder.getInputRows();
        outputType = pyramidBuilder.getOutputType();
        pyramidString = pyramidBuilder.buildPyramidString(inputRows);
        pyramidBuilder.sendToDrawer(outputType, pyramidString);
    }
     */

}
