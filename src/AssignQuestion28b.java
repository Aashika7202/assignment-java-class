import java.util.Scanner;

public class AssignQuestion28b {

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Function to print first N prime numbers
    public static void firstNthPrime(int n) {
        int count = 0;
        int number = 2;
        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            if (isPrimeNumber(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the number of primes
        System.out.print("Enter how many prime numbers you want: ");
        int n = scanner.nextInt();

        // Displaying first N prime numbers
        firstNthPrime(n);
    }
}
