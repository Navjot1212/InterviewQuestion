package InterviewQuestions;

import java.util.Scanner;
import java.util.stream.Collectors;

public class NonRepeatingStrings {

	public static void main(String[] args) {
		// Java Program to Print non Repeating Characters in String
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a String");
			String s1 = sc.nextLine();

			// Method 1
			System.out.println(s1.replace(" ", "").toLowerCase().chars().mapToObj(c -> (char) c).distinct()
					.collect(Collectors.toList()).toString());

			// Method 2
			s1.replace(" ", "").toLowerCase().chars().mapToObj(c -> (char) c).distinct().forEach(System.out::println);

			// Method 3
			s1 = s1.replace(" ", "").toLowerCase().chars().mapToObj(c -> (char) c).distinct().map(Object::toString)
					.collect(Collectors.joining());
			System.out.println(s1);

		}
	}
}