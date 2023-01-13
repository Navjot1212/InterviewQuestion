package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		// Program to remove duplicate element in an array.
		int[] nums = { 22, 56, 22, 14, 9, 33, 45, 26, 56, 19, 33 };

		// Method 1
		// Distinct Method removes duplicate elements
		Arrays.stream(nums).boxed().distinct().forEach(n->System.out.println(n));


		// Method 2
		// HashSet only stores unique values
		HashSet<Integer> numList2 = new HashSet<>();
		for (int num : nums) {
			numList2.add(num);
		}
		numList2.forEach(System.out::println);

		// Method 3
		ArrayList<Integer> numList3 = new ArrayList<>();
		for (int num : nums) {
			if (!numList3.contains(num)) {
				numList3.add(num);
			}
		}
		System.out.println(numList3.toString());


	}
}
