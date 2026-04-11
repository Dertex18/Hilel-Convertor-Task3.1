import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WelcomeMessage();

        switch (input.nextInt()) {
            case 1:
                System.out.println("\nEnter temperature value (in Fahrenheit): ");
                int degreesFahrenheit = input.nextInt();
                System.out.println("\nConverted Fahrenheit to Celsius Fahrenheit...\n");
                double resultCelcius = convertFahrenheitToCelsius(degreesFahrenheit);
                System.out.printf("Degrees in Celcius: %.2f".formatted(resultCelcius));
                break;
            case 2:
                System.out.println("\nEnter temperature value (in Celsius): ");
                int degreesCelsius = input.nextInt();
                System.out.println("\nConverted Celsius to Fahrenheit...\n");
                double resultFahrenheit = convertCelsiusToFahrenheit(degreesCelsius);
                System.out.printf("Degrees in Fahrenheit: %.2f".formatted(resultFahrenheit));
                break;
                default:
                    System.out.println("Invalid input!");
        }


    }

    private static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double convertCelsiusToFahrenheit(double celsius) {
        return  (celsius * 9/5) + 32;
    }

    private static void WelcomeMessage() {
        System.out.println("""
        Welcome to Temperature Converter
        Version 1.0
        Choose an option:
        """);

    }
}