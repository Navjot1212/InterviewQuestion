package InterviewQuestions;

import java.util.Scanner;

public class TwinkleTwinkle {

	public static void main(String[] args) {
		// Twinkle Twinkle
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				String line = sc.nextLine();
				String[] words = line.split(" ");
				String firstWord = words[0];
				String lastWord = words[words.length - 1];
				String reversedLine = firstWord + " ";
				for (int j = words.length - 2; j > 0; j--) {
					reversedLine += words[j] + " ";
				}
				if(words.length>1) {
				reversedLine += lastWord;
				}
				System.out.println(reversedLine);
			}
			sc.close();
		}
	}
}