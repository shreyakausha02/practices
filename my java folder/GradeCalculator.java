
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for five subjects
        System.out.print("Enter marks in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = scanner.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int mathematics = scanner.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = scanner.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + biology + mathematics + computer;
        double percentage = (totalMarks / 500.0) * 100;

        // Determine grade
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Output result
        System.out.println("Total Marks: " + totalMarks + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}



