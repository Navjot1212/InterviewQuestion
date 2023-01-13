package JavaInterviewQuestions;

import java.util.Scanner;

public class Question28 {

	public static void main(String[] args) {
		try (// 28: Write a Program to Check Whether a Number is Prime or Not
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num = sc.nextInt();
			int factors = 0;
			if (num <= 1) {
				System.out.println("Number is neither a prime number nor a composite number");
			} else {
				for (int counter = 1; counter <= num; counter++) {
					if (num % counter == 0) {
						factors++;
					}
				}
				if (factors == 2) {
					System.out.println(num + " is prime number");

				} else {
					System.out.println(num + " is composite number");
				}
			}
		}
	}
}
