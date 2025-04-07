import java.util.Scanner;

public class AssignQuestion29 {

    // Function to calculate factorial of a number
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to calculate the series sum
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        double sum = 0;

        // Calculate the series sum
        for (int i = 1; i <= N; i++) {
            sum += (double) i / factorial(i);
        }

        // Output the result
        System.out.println("The sum of the series is: " + sum);
    }
}
