package JavaInterviewQuestions;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 1 : Write a program to reverse a string and check if it is a palindrome.
			System.out.println("Please enter a string :");
			String str = sc.nextLine();
			String reversedStr = "";
			for (int i = str.length(); i > 0; i--) {
				reversedStr += str.charAt(i - 1);
			}
			System.out.println("Reversed String : " + reversedStr);
			if (str.equalsIgnoreCase(reversedStr)) {
				System.out.println("Reversed String is palindrome");
			} else {
				System.out.println("Reversed String is not palindrome");
			}
		}
	}

}
