
import java.util.Scanner;
public class AssignQuestion23 {

    // Method to calculate sum of 1 to n
        public static int sumNaturalNumbers(int n) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input
            System.out.print("Enter a positive number (n): ");
            int n = scanner.nextInt();

            // Call method and display result
            int result = sumNaturalNumbers(n);
            System.out.println("Sum of natural numbers from 1 to " + n + " is: " + result);
        }
    }


