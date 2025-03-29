import java.util.Scanner;
public class AssignQuestion13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.print("The number entered is:" +number);
        } else{
            System.out.print("The number entered id positive");
        }

        scanner.close();
    }

}
