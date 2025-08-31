
import java.util.Scanner;

public class RectangleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate the area and perimeter
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        // Check if area is greater than perimeter
        if (area > perimeter) {
            System.out.println("The area of the rectangle is greater than its perimeter.");
        } else if (area < perimeter) {
            System.out.println("The area of the rectangle is less than its perimeter.");
        } else {
            System.out.println("The area of the rectangle is equal to its perimeter.");
        }

        scanner.close();
    }
}
