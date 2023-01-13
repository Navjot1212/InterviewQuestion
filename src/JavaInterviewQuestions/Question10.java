package JavaInterviewQuestions;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		try (// 10: Write a program to change all letter form small case to capital case in a string.
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a string :");
			String str = sc.next();
			System.out.println("Length of entered string is : " + str.toUpperCase());
		}
	}

}
