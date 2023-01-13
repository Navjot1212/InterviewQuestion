package JavaInterviewQuestions;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		try (// 18: Write a Program to Check Whether a Character is Alphabet or Not
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a Character :");
			char character = sc.next().charAt(0);
			if(Character.isAlphabetic(character)) {
				System.out.println(character+" is an Alphabet");
			}else {
				System.out.println(character+" is NOT an Alphabet");
			}
		}
	}

}
