import java.util.Scanner;

public class AssignQuestion5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Calculate area of a circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circleArea = Math.PI * radius * radius;
            System.out.println("Area of the circle: " + circleArea);

            // Calculate area of a rectangle
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = length * width;
            System.out.println("Area of the rectangle: " + rectangleArea);

            // Calculate area of a triangle
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double triangleArea = 0.5 * base * height;
            System.out.println("Area of the triangle: " + triangleArea);

            // Close the scanner
            scanner.close();
        }
    }


