package JavaInterviewQuestions;

import java.util.Random;
import java.util.Scanner;

public class Question14 {

	public static void main(String[] args) {
		// 14: Write a program to write Rock, Paper, Scissors game in java.
		try (Scanner sc = new Scanner(System.in)) {
			Random random = new Random();
			String[] gameArray = { "Rock", "Paper", "Scissor" };
			int randomNum = random.nextInt(gameArray.length);
			String randomSelection = gameArray[randomNum];
			String userSelection;
			do {
				System.out.println("Please choose one : Rock\uD83E\uDEA8, Paper\uD83D\uDCC4 or Scissor\u2702\uFE0F");
				userSelection = sc.next();
			} while (!(userSelection.equalsIgnoreCase("Rock") || userSelection.equalsIgnoreCase("Paper")
					|| userSelection.equalsIgnoreCase("Scissor")));
			if (userSelection.equalsIgnoreCase(randomSelection)) {
				System.out.println("Its a draw Computer also selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Rock") && randomSelection.equalsIgnoreCase("Scissor")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Scissor") && randomSelection.equalsIgnoreCase("Paper")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else if (userSelection.equalsIgnoreCase("Paper") && randomSelection.equalsIgnoreCase("Rock")) {
				System.out.println("You won Computer selected " + randomSelection);
			} else {
				System.out.println("You lost computer selected " + randomSelection);
			}
		}
	}
}
