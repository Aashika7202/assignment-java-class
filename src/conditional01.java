import java.util.Scanner;
public class conditional01 {
    public static void main(String[] args) {
            // Create a Scanner object to read input from the user
          Scanner scanner = new Scanner(System.in);

            // Ask the user to enter a number
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();

            // Check if the number is positivews2 , negative, or zero
            if (number > 0) {
                System.out.println("The number " + number + " is positive.");
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }

            // Close the scanner
            scanner.close();
        }
    }

