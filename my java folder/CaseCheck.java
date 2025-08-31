

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input character from user
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        // Check if the character is uppercase or lowercase
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }

        scanner.close();
    }
}
