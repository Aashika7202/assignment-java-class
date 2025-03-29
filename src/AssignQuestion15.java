import java.util.Scanner;
public class AssignQuestion15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a code(0-128): ");
        int asciiCode=scanner.nextInt();

        if(asciiCode>=0 && asciiCode<=128) {
            char character = (char) asciiCode;
            System.out.println("The value of asciiCode" +asciiCode+ "is:" +character) ;
        } else {
            System.out.println("The value of asciiCode is invalid");
        }
        scanner.close();
    }

}
