package JavaInterviewQuestions;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 3 : Write a program to find the maximum number in an array.
			int[] numArray = new int[5];
			int maxNum = 0;
			System.out.println("Please enter whole 5 numbers in an array");
			for (int i = 0; i <= numArray.length - 1; i++) {
				numArray[i] = sc.nextInt();
				if (numArray[i] > maxNum) {
					maxNum = numArray[i];
				}
			}
			System.out.println("Maximum number in array is " + maxNum);
		}

	}

}
