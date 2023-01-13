package JavaInterviewQuestions;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		try (//15: Write a program to reverse a String with for loop.
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a string :");
			String str = sc.nextLine();
			String reversedStr = "";
			for (int i = str.length(); i > 0; i--) {
				reversedStr += str.charAt(i - 1);
			}
			System.out.println("Reversed String : " + reversedStr);
		}

	}

}
