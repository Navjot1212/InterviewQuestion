package JavaInterviewQuestions;

import java.util.Scanner;

public class Question26 {

	public static void main(String[] args) {
		try (// 26: Write a Program to Display Factors of a Number
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num = sc.nextInt();
			String factors = "";
			for (int counter = 1; counter <= num; counter++) {
				if (num % counter == 0) {
					factors += counter + " ";
				}
			}
			System.out.println("Factors of " + num + " are " + factors);
		}
	}
}