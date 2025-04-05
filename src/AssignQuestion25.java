
import java.util.Scanner;
public class AssignQuestion25 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask for number of students
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();
            scanner.nextLine(); // Consume leftover newline

            // Variables to store highest score info
            String topStudent = "";
            int highestScore = -1;

            // Loop through each student
                for (int i = 1; i <= numStudents; i++) {
                System.out.print("Enter name of student " + i + ": ");
                String name = scanner.nextLine();

                System.out.print("Enter score of " + name + ": ");
                int score = scanner.nextInt();
                scanner.nextLine(); // Consume leftover newline

                // Check if this student has the highest score
                if (score > highestScore) {
                    highestScore = score;
                    topStudent = name;
                }
            }

            // Output the student with the highest score
            System.out.println("\nStudent with the highest score:");
            System.out.println("Name: " + topStudent);
            System.out.println("Score: " + highestScore);
        }
    }



