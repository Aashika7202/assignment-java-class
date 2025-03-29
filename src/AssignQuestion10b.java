import java.util.Scanner;
public class AssignQuestion10b {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input for the sides of the triangle
            System.out.print("Enter side a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter side b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter side c: ");
            double c = scanner.nextDouble();

            // Calculating the semi-perimeter
            double s = (a + b + c) / 2;

            // Calculating the area using Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Checking if the triangle is valid before displaying the area
            if (area > 0) {
                System.out.println("The area of the triangle is: " + area);
            } else {
                System.out.println("Invalid triangle!");
            }

            scanner.close();
        }
    }



