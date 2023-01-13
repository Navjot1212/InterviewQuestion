package JavaInterviewQuestions;

import java.util.Scanner;

public class Question17 {
	public static void main(String[] args) {
		try (// 17: Write a Program to Check Whether a Number is Positive or Negative
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num = sc.nextInt();
			if(num==0) {
				System.out.println(num+ " is neither positive nor negative.");
			}else if (num>0) {
				System.out.println(num+ " is positive.");
			}else {
				System.out.println(num+ " is negative.");
			}
		}
		
	}
}