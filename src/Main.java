import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter");
        System.out.println("Version 1.0");

        System.out.println("\nEnter temperature value (in Fahrenheit): ");
        int degreesFahrenheit = input.nextInt();
        System.out.println("\nConverted Fahrenheit to Celsius Fahrenheit...\n");
        double resultCelcius = convertFahrenheitToCelsius(degreesFahrenheit);
        System.out.printf("Degrees in Celcius: %.2f".formatted(resultCelcius));
    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}