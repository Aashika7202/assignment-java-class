import java.util.Scanner;
public class AssignQuestion19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int side1 = scanner.nextInt();
        System.out.print("Enter the second side: ");
        int side2 = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int side3 = scanner.nextInt();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("This is an equilateral triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("This is Isosceles Triangle ");
            }
            else {
                System.out.print("The triangle is a Scalene triangle.");}
        } else {
                System.out.print("Invalid triangle");
            }
        }
}