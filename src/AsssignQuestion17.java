import java.util.Scanner;
public class AsssignQuestion17 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year= scanner.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.print("This is a leap year");
        } else{
            System.out.print("This is not a leap year");
        }
        scanner.close();
    }
}
