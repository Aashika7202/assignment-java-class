import java.util.Scanner;
public class AssignQuestion28a {
    // Function to check if a number is prime
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for number
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();

        // Checking if the number is prime
        if (isPrimeNumber(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
