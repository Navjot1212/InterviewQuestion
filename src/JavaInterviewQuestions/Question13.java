package JavaInterviewQuestions;

public class Question13 {

	public static void main(String[] args) {
		// 13: Write a program to remove second character of every word in a sentence.
		String sentence = "This is a sentence and i have removed every second character of every word";
		System.out.println("Before :");
		System.out.println(sentence);
		System.out.println("After :");
		String[] words = sentence.split(" ");
		for (String word : words) {
			if (word.length() < 2) {
				System.out.print(word + " ");
				continue;
			}
			System.out.print(word.replaceFirst(word.substring(1, 2), "") + " ");
		}
	}

}
