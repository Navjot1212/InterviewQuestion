package InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// Java Program to check given strings are Anagram or not
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter first String");
			String s1 = sc.nextLine();
			System.out.println("Please enter second String");
			String s2 = sc.nextLine();
			char[] arr1 = s1.toLowerCase().toCharArray();
			char[] arr2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				System.out.println("Both Strings are Anagram");
			} else {
				System.out.println("Both Strings are not Anagram");
			}
		}
	}
}