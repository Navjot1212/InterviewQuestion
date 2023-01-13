package JavaInterviewQuestions;

import java.util.Scanner;

public class Question23 {

	public static void main(String[] args) {
		try (// 23:Write a Program to Calculate the Power of a Number
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a base :");
			double base = sc.nextDouble();	
			System.out.println("Please enter exponent:");
			double exponent = sc.nextDouble();
			double power = Math.pow(base, exponent);
			System.out.printf("%.1f^%.1f is : %.1f",base, exponent,power);
		}
	}
}
