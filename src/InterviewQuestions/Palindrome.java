package InterviewQuestions;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Write a program to find if given input is palindrome or not.
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter input :");
			String input = sc.nextLine();
			input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			String reversedInput = new StringBuilder(input).reverse().toString();
			if (input.equals(reversedInput)) {
				System.out.println("Input \"" + input + "\" is palindrome");
			} else {
				System.out.println("Input \"" + input + "\" is not palindrome");

			}
		}
	}
}
