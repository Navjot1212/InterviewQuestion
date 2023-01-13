package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveFirstCharacter {

	public static void main(String[] args) {
		// Program to remove first character from every element in the array list
		ArrayList<String> names = new ArrayList<String>(
				List.of("Navjot", "Kuldeep", "Sahib", "Sanil", "Daman", "Yo", "a", ""));

		// Method 1
		names.stream().filter(s -> s.length() >= 1)
				.forEach(s -> System.out.println(s.replaceFirst(s.substring(0, 1), "")));

		// Method 2
		for (String s : names) {
			if (s.length() >= 1) {
				System.out.println(s.replaceFirst(s.substring(0, 1), ""));
			}
		}

	}
}
