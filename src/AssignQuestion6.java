import java.util.Scanner;

public class AssignQuestion6 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Calculate area and perimeter of a circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double circleArea = Math.PI * radius * radius;
            double circlePerimeter = 2 * Math.PI * radius;
            System.out.println("Area of the circle: " + circleArea);
            System.out.println("Perimeter of the circle: " + circlePerimeter);

            // Calculate area and perimeter of a rectangle
            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            double rectangleArea = length * width;
            double rectanglePerimeter = 2 * (length + width);
            System.out.println("Area of the rectangle: " + rectangleArea);
            System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

            // Calculate area and perimeter of a triangle
            System.out.print("Enter the first side of the triangle: ");
            double side1 = scanner.nextDouble();
            System.out.print("Enter the second side of the triangle: ");
            double side2 = scanner.nextDouble();
            System.out.print("Enter the third side of the triangle: ");
            double side3 = scanner.nextDouble();
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();
            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();
            double triangleArea = 0.5 * base * height;
            double trianglePerimeter = side1 + side2 + side3;
            System.out.println("Area of the triangle: " + triangleArea);
            System.out.println("Perimeter of the triangle: " + trianglePerimeter);

            // Close the scanner
            scanner.close();
        }
    }


