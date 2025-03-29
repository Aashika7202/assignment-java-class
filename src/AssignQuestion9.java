import java.util.Scanner;

public class AssignQuestion9 {

        public static void main(String[] args) {
            // Create a Scanner object to get user input
            Scanner input = new Scanner(System.in);

            // Prompt the user to enter the number of pounds
            System.out.print("Enter weight in pounds: ");
            double pounds = input.nextDouble();

            // Convert pounds to kilograms
            double kilograms = pounds * 0.454;

            // Display the result
            System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");

            // Close the scanner
            input.close();
        }
    }


