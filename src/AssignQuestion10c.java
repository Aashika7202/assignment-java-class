
import java.util.Scanner;
public class AssignQuestion10c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a:");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b:");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c:");
        double c = scanner.nextDouble();

        //Calculating the discriminant: D = b^2 - 4ac
        double discriminant = (b * b) - (4 * a * c);
        // Only calculating the positive root
        if (discriminant >= 0) {

            //Math.sqrt(discriminant) means square root of b^2-4ac
            double root = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.print("The positive root is:" + root);
        } else {
            System.out.print("No real root exist.");

        }
        scanner.close();

    }

}
