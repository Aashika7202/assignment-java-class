import java.util.Scanner;

public class AssignQuestion14 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        if(num1==num2) {
            System.out.print("both integers are equal ");
        }else if(num1>num2){
            System.out.print("First integer("+num1+") is greater than second integer("+num2+"). ");

        } else{
            System.out.print("First integer("+num2+") is greater than second integer("+num1+"). ");
        }
        scanner.close();


    }

}
