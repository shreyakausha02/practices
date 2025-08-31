
import java.util.Random;
import java.util.Scanner;

public class CricketGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // List of choices
        String[] choices = {"Bat", "Ball", "Stomp"};

        // Take user input
        System.out.println("Enter your choice (Bat, Ball, Stomp): ");
        String userChoice = scanner.nextLine();

        // Get computer's choice
        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer's choice: " + computerChoice);

        // Determine the winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Tie!");
        } else if ((userChoice.equalsIgnoreCase("Bat") && computerChoice.equals("Ball")) ||
                   (userChoice.equalsIgnoreCase("Ball") && computerChoice.equals("Stomp")) ||
                   (userChoice.equalsIgnoreCase("Stomp") && computerChoice.equals("Bat"))) {
            System.out.println("User wins!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
