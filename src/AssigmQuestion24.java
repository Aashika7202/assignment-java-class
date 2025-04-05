import java.util.Scanner;
public class AssigmQuestion24 {
    // Method to calculate factorial
        public static long factorial(int n) {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input
            System.out.print("Enter a non-negative integer: ");
            int num = scanner.nextInt();

            // Check if input is valid
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                // Call method and display result
                long result = factorial(num);
                System.out.println("Factorial of " + num + " is: " + result);
            }
        }
    }


