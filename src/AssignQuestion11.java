import java.util.Scanner;
public class AssignQuestion11 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b:");
        int b = scanner.nextInt();

        System.out.print("before swapping: a = " + a + ", b = " + b );
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.print("After swapping: a = " + a + ", b = " + b );

        scanner.close();

    }
}

