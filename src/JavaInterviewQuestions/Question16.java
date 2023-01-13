package JavaInterviewQuestions;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		try (// 16: Write a program to Check Whether an Alphabet is Vowel or Consonant.
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter an Alphabet :");
			char alphabet = sc.next().charAt(0);
			alphabet = Character.toUpperCase(alphabet);
			if(alphabet=='A'||alphabet=='E'||alphabet=='I'||alphabet=='O'||alphabet=='U') {
				System.out.println("Entered alphabet \'"+alphabet+"\' is Vowel");
			}else {
				System.out.println("Entered alphabet \'"+alphabet+"\' is Consonant");

			}
		}
	}

}
