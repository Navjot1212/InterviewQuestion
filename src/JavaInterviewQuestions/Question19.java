package JavaInterviewQuestions;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		try (//19: Write a Program to Calculate the Sum of Natural Numbers
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a Natural number:");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1; i<=num;i++) {
				sum+=i;
			}
			System.out.println("Sum of Natural numbers is : "+sum);
		}

	}

}
