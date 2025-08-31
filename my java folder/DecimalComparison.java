
import java.util.Scanner;

public class DecimalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two floating-point numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Multiply both by 1000 and convert to int for comparison
        int intNum1 = (int)(num1 * 1000);
        int intNum2 = (int)(num2 * 1000);

        // Check equality up to three decimal places
        if (intNum1 == intNum2) {
            System.out.println("The numbers are the same up to three decimal places.");
        } else {
            System.out.println("The numbers are different.");
        }

        scanner.close();
    }
}