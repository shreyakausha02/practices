
import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input character from user
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase for case-insensitive comparison
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Please enter a valid alphabet.");
        }

        scanner.close();
    }
}
