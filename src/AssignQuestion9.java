import java.util.Scanner;
public class AssignQuestion9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a full line of text

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Reads an integer

        System.out.print("Enter your height: ");
        double height = scanner.nextDouble(); // Reads a decimal number

        System.out.println("Hello " + name + ", you are " + age + " years old and " + height + " meters tall.");

        scanner.close(); // Close the scanner to prevent memory leaks
    }
    }

