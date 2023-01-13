package JavaInterviewQuestions;

import java.util.Scanner;

public class Question24 {

	public static void main(String[] args) {
		try (// 24: Write a Program to Check Whether a Number is Palindrome
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num1 = sc.nextInt();
			int num = num1;
			int revNum = 0;
			while (num != 0) {
				revNum = revNum * 10 + (num % 10);
				num /= 10;
			}
			if (num1 == revNum) {
				System.out.println(num1 + " is a Palindrome number");
			} else {
				System.out.println(num1 + " is NOT a Palindrome number");
			}
		}
	}
}
