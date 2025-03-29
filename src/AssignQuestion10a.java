import java.util.Scanner;
public class AssignQuestion10a {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user
            System.out.print("Enter initial velocity (u): ");
            double u = scanner.nextDouble();

            System.out.print("Enter acceleration (a): ");
            double a = scanner.nextDouble();

            System.out.print("Enter time (t): ");
            double t = scanner.nextDouble();

            // Applying the equation: s = ut + (1/2) * a * t^2
            double s = (u * t) + (0.5 * a * t * t);

            // Displaying the result
            System.out.println("The calculated displacement (s) is: " + s);

            scanner.close();
        }
    }


