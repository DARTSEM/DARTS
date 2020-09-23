package com.julia.dart;

import java.util.Scanner;

public class Utilities {
    private static Scanner scan = new Scanner(System.in);
    public static int intInput ()
        int value;
        //inputs integer then prints to console after next line
        value = scan.nextInt();
        scan.nextLine();
        return value;
    }

    public static Double doubleInput () {
        double value;
        //inputs double value then prints to console after next line
        value = scan.nextDouble();
        scan.nextLine();
        return value;
    }

    public static String stringInput () {
        return scan.nextLine();
    }
    public static void closeScanner() {
        scan.close();
    }
    public static String line() {
        return "--------------------------------------------------------------------------------------------------------\n";
    }
}
