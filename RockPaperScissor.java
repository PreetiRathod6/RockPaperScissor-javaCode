import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor{
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your choice (rock, paper, or scissors): ");
        String userChoice = scanner.next().toLowerCase();  // Convert the user's input to lowercase

        int computerChoiceNumber = random.nextInt(3);  // 0 for rock, 1 for paper, 2 for scissors

        String computerChoice = "";
        if (computerChoiceNumber == 0) {
            computerChoice = "rock";
        } else if (computerChoiceNumber == 1) {
            computerChoice = "paper";
        } else {
            computerChoice = "scissors";
        }

        System.out.println("Computer chose: " + computerChoice);

        // Determine the winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        scanner.close();
    }
}
