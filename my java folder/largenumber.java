import java.util.Scanner;

public class largenumber
 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Prompting user for input
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Using if-else statements to find the largest number
        int largest;
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Displaying the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
    
