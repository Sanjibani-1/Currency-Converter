import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Predefined exchange rates
        try (Scanner scanner = new Scanner(System.in)) {
            // Predefined exchange rates
            double usdToEur = 0.85;  // 1 USD = 0.85 EUR
            double eurToUsd = 1.18;  // 1 EUR = 1.18 USD
            double usdToInr = 82.50; // 1 USD = 82.50 INR
            double inrToUsd = 0.012; // 1 INR = 0.012 USD
            
            // Display options to the user
            System.out.println("Welcome to Currency Converter!");
            System.out.println("Select the conversion type:");
            System.out.println("1: USD to EUR");
            System.out.println("2: EUR to USD");
            System.out.println("3: USD to INR");
            System.out.println("4: INR to USD");
            
            int choice = scanner.nextInt();
            System.out.print("Enter the amount you want to convert: ");
            double amount = scanner.nextDouble();
            double convertedAmount = 0.0;
            
            // Perform the conversion based on user choice
            switch (choice) {
                case 1 -> {
                    convertedAmount = amount * usdToEur;
                    System.out.println(amount + " USD = " + convertedAmount + " EUR");
                }
                case 2 -> {
                    convertedAmount = amount * eurToUsd;
                    System.out.println(amount + " EUR = " + convertedAmount + " USD");
                }
                case 3 -> {
                    convertedAmount = amount * usdToInr;
                    System.out.println(amount + " USD = " + convertedAmount + " INR");
                }
                case 4 -> {
                    convertedAmount = amount * inrToUsd;
                    System.out.println(amount + " INR = " + convertedAmount + " USD");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } // 1 USD = 0.85 EUR
    }
}

