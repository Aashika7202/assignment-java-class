import java.util.Scanner;

public class AssignQuestion3 {

    public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Calculate sum and average
            double sum = num1 + num2;
            double average = sum / 2;

            // Display results
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);

            // Close the scanner
            scanner.close();
        }
    }


