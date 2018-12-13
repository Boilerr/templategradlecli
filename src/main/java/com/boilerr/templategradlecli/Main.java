package com.boilerr.templategradlecli;

public class Main {

    public static void main(String[] args) {

        HelpMessages checkAndHelp = new HelpMessages(args);
        checkAndHelp.run();

        String pathToFile = args[0];

        ReadFile readFile = new ReadFile(pathToFile);
        double[] data = readFile.getArrayOfDoubles();

        StatsAndPrint statAndPrint = new StatsAndPrint(data);
        statAndPrint.doFirstStats();
        statAndPrint.doSecondStats();

        System.out.println();
        System.out.println("Work done!");
    }

}
