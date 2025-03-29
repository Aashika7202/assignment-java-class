package ScannerClass;

import java.util.Scanner;

public class ScannerClass{

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // 1. Accepting and Printing a String (Name)
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Name: " + name);

        // 2. Accepting and Printing Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Age: " + age);

        // 3. Accepting and Printing a Decimal Number (float)
        System.out.print("Enter the temperature: ");
        float temperature = scanner.nextFloat();
        System.out.println("Temperature: " + temperature + "°C");

        // 4. Accepting and Printing a Decimal Number (double)
        System.out.print("Enter the value of Pi: ");
        double piValue = scanner.nextDouble();
        System.out.println("Value of Pi: " + piValue);

        // 5. Accepting and Printing Long Integer
        System.out.print("Enter a large distance: ");
        long distance = scanner.nextLong();
        System.out.println("Distance: " + distance + " meters");

        // Consume the remaining newline character after reading a number
        scanner.nextLine(); // This is important to avoid issues with reading the next String input

        // 6. Accepting and Printing a Single Character
        System.out.print("Enter the first letter of your name: ");
        char initial = scanner.nextLine().charAt(0);  // Reads a single character from the input string
        System.out.println("Initial: " + initial);

        // 7. Accepting and Printing Boolean
        System.out.print("Are you active? (true/false): ");
        boolean isActive = scanner.nextBoolean();
        System.out.println("Is Active: " + isActive);

        // 8. Accepting and Printing a Short Integer
        System.out.print("Enter a small number: ");
        short smallNumber = scanner.nextShort();
        System.out.println("Small Number: " + smallNumber);

        // 9. Accepting and Printing a Byte Value
        System.out.print("Enter a byte value: ");
        byte byteNumber = scanner.nextByte();
        System.out.println("Byte Value: " + byteNumber);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
