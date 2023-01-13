package JavaInterviewQuestions;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 9 : Write a program to find the length of a string.
			System.out.println("Please enter a string :");
			String str = sc.next();
			System.out.println("Length of entered string is : " + str.length());
		}
	}
}
