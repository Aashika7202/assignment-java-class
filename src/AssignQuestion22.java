import java.util.Scanner;
public class AssignQuestion22 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int num = scanner.nextInt();
        // Print the multiplication table
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scanner.close();
    }
}

