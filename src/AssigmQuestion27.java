import java.util.Scanner;

public class AssigmQuestion27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int product = 1;

        int temp = number; // Preserve the original number

        // Loop to extract digits
            while (temp != 0) {
            int digit = temp % 10;   // Get last digit
            sum += digit;            // Add to sum
            product *= digit;        // Multiply to product
            temp /= 10;              // Remove last digit
        }

        // Output
        System.out.println("Sum of digits of " + number + " = " + sum);
        System.out.println("Product of digits of " + number + " = " + product);
    }
}


