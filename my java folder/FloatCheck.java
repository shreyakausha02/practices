
import java.util.Scanner;

public class FloatCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a floating-point number from the user
        System.out.print("Enter a floating-point number: ");
        float number = scanner.nextFloat();

        // Check and print result
        if (number == 0.0f) {
            System.out.println("zero");
        } else if (number > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        scanner.close();
}
}

