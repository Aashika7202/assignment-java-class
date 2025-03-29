import java.util.Scanner;
public class AsssignQuestion11b {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b:");
        int b = scanner.nextInt();
        System.out.print("before swapping: a = " + a + ", b = " + b );

        // Swapping without a temporary variable
        a = a + b;  // Step 1: a becomes the sum of a and b
        b = a - b;  // Step 2: b becomes the original value of a
        a = a - b;  // Step 3: a becomes the original value of b

        System.out.print("After swapping: a = " + a + ", b = " + b );

        scanner.close();


    }


}
