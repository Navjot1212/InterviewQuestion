package JavaInterviewQuestions;

import java.util.Scanner;

public class Question21 {

	public static void main(String[] args) {
		try (// 21: Write a Program to Generate Multiplication Table
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num = sc.nextInt();		
			int result;
			 for(int i = 1;i<=10;i++){
				result = num * i;
				System.out.println(num + " x " + i + " = " + result);
			}
		}

	}

}
