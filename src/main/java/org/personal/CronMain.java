package org.personal;

public class CronMain {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(args[0]);
            throw new IllegalArgumentException("Invalid number of arguments");
        }
        CronFieldParser cronFieldParser = new CronFieldParser();
        cronFieldParser.parse(args[0]);
    }
}