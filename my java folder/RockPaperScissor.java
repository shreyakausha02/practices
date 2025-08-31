
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // List of choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        // Take user input
        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
        String userChoice = scanner.nextLine();

        // Get computer's choice
        String computerChoice = choices[random.nextInt(3)];

        System.out.println("Computer's choice: " + computerChoice);

        // Determine the winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a Tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("User wins!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
