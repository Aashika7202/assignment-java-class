import java.util.Scanner;
public class AsssignQuestion12 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();

        System.out.println("=====Personal Information=====");
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
        System.out.println("Nationality:" +nationality);

        scanner.close();







    }

}
