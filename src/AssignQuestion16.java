import java.util.Scanner;
public class AssignQuestion16 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if(number%2==0){ //% the modulus operator,
            // which returns the remainder of a division.
            System.out.println("given number is even number");
        } else{
            System.out.println("Given number is odd number");
        }
        scanner.close();
    }
}
