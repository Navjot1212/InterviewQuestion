package InterviewQuestions;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		// How to Make a Rock-Paper-Scissors Game in Java?
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();
			String[] gameArray = { "Rock", "Paper", "Scissor" };
			String randomSelection = gameArray[random.nextInt(3)];
			System.out.println("Please choose one : Rock\uD83E\uDEA8, Paper\uD83D\uDCC4 or Scissor\u2702\uFE0F");
			String userSelection = sc.next();
			if (userSelection.equalsIgnoreCase(randomSelection)) {
				System.out.println("Its a draw Computer also selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Rock") && randomSelection.equalsIgnoreCase("Scissor")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Paper") && randomSelection.equalsIgnoreCase("Rock")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Scissor") && randomSelection.equalsIgnoreCase("Paper")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else {
				System.out.println("You lost computer selected " + randomSelection);
			}
		}
	}
}
