package app;

import java.util.Scanner;

public class ConverterMilesAndKilometrs {
    private static final double COEFFICIENT_MILES_CONSTANT = 1.60934;
    Scanner scanner = new Scanner(System.in);

    public static double convertMilesToKilometers(double miles) {
        double kilometers = miles * COEFFICIENT_MILES_CONSTANT;
        return kilometers;
    }

    public static double convertKilometrsToMiles(double kilometers) {
        double miles = kilometers / COEFFICIENT_MILES_CONSTANT;
        return miles;
    }

    public static void printResult (double inputData, String fromInput, double outputData, String fromOutput){
        System.out.println(inputData + " " +fromInput + " " + outputData + " " + fromOutput );
    }

}
