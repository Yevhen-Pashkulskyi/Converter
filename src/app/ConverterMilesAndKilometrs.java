package app;

import java.util.Scanner;

public class ConverterMilesAndKilometrs {
    private static final double COEFFICIENT_MILES_CONSTANT = 1.60934;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть число миль через кому, яке потрібно конвертувати в кілометри");
        double milesToKilometrs = scanner.nextDouble();
        double kilometrs = convertMilesToKilometers(milesToKilometrs);
        printResult(milesToKilometrs,"міль", kilometrs,"кілометр" );

        System.out.println("Введіть число кілометрів через кому, яке потрібно конвертувати в мілі");
        double kilometrsToMiles = scanner.nextDouble();
        double miles = convertKilometrsToMiles(kilometrsToMiles);
        printResult(kilometrsToMiles, "кілометр", miles, "міль");

    }

    public static double convertMilesToKilometers(double miles) {
        double kilometers = miles * COEFFICIENT_MILES_CONSTANT;
        return kilometers;
    }

    public static double convertKilometrsToMiles(double kilometers) {
        double miles = kilometers / COEFFICIENT_MILES_CONSTANT;
        return miles;
    }

    public static void printResult (double inputData, String fromInput, double outputData, String fromOutput){
        System.out.println(inputData + " " +fromInput + " = " + outputData + " " + fromOutput );
    }

}
