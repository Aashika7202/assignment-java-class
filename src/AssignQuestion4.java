import java.util.Scanner;

public class AssignQuestion4 {

        public static void main(String[] args) {
            // Create a Scanner object to read input
            Scanner scanner = new Scanner(System.in);

            // Prompt user for input
            System.out.print("Enter Principal amount: ");
            double principal = scanner.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = scanner.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = scanner.nextDouble();

            // Calculate Simple Interest
            double simpleInterest = (principal * time * rate) / 100;

            // Display result
            System.out.println("Simple Interest: " + simpleInterest);

            // Close the scanner
            scanner.close();
        }
    }


