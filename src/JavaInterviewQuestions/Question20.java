package JavaInterviewQuestions;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		try (// 20: Write a Program to Find Factorial of a Number
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number to find factorial:");
			int num = sc.nextInt();
			int factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial = factorial * i;
			}
			System.out.println("Factorial of " + num + " is: " + factorial);
		}
	}
}
