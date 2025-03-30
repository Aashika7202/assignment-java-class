import java.util.Scanner;
public class AssignQuestion20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter any operator(+, -, *, /) ");
        char operator = scanner.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

        // Performing the operation based on the operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = (double) num1 / num2;
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, * or /.");
                validOperation = false;
        }
        // Displaying the result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
       }
    }
