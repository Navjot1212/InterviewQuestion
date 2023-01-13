package JavaInterviewQuestions;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 2 : Write a program to find if the number is prime or not.
			System.out.println("Please enter a number :");
			int num = sc.nextInt();
			int factors = 0;
			if (num < 1) {
				System.out.println("Number is neither a prime number nor a composite number");
			} else {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						factors++;
					}
				}
				if (factors == 2) {
					System.out.println("Number " + num + " is prime number");

				} else {
					System.out.println("Number " + num + " is composite number");
				}
			}
		}

	}

}
