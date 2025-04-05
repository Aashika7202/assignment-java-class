import java.util.Scanner;

public class AssignQuestion26 {

    // Method to reverse a number
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;            // Extract last digit
            reversed = reversed * 10 + digit;   // Append to reversed number
            number /= 10;                       // Remove last digit
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Reverse and output
        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}
