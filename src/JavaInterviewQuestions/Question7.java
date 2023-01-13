package JavaInterviewQuestions;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 7 : Write a program to find if a string is a substring of another String.
			System.out.println("Please enter first string :");
			String str1 = sc.next();
			System.out.println("Please enter second string :");
			String str2 = sc.next();
			if (str2.contains(str1)) {
				System.out.println("First string is substring of second string");
			}else if (str1.contains(str2)) {
				System.out.println("Second string is substring of first string");
			}else {
				System.out.println("Both Strings are different");
			}
		}
		

	}

}
