package com.boilerr.templategradlecli;


class HelpMessages {

    private final String[] args;
    private String version = "0.1";

    HelpMessages(String[] args) {
        this.args = args;
    }

    void run() {

        if (args.length == 0) {
            properUse();
        }

        if ((args[0].equals("-h") || (args[0].equals("--help")))) {
            help();
        }


        if (args[0].equals("-v") || args[0].equals("--version")) {
            System.out.println(version);
            System.exit(0);
        }

        if (args.length != 1) {
            System.out.println("Typo in param, only one parameter needed");
            properUse();
        }

    }

    private void properUse() {
        System.out.println("This programs need only path to .csv file, example: D:/111.csv");
        System.exit(0);
    }

    private void help() {
        System.out.println("Name of program");
        System.out.println(version);
        System.out.println("This is help, -h, --help, -v, --version ");
        System.exit(0);
    }


}
