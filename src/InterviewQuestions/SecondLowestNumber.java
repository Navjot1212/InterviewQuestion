package InterviewQuestions;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.stream.Collectors;

public class SecondLowestNumber {

	public static void main(String[] args) {
		// Write a program to find the second lowest element in an array.
		int[] nums = { 22, 56, 22, 14, 9, 33, 45, 26, 56, 19, 33 };

		// Method 1
		// distinct method removes duplicate values and sorted method will sort
//		System.out.println(Arrays.stream(nums).boxed().distinct().sorted().collect(Collectors.toList()).get(1));
//
//		// Write a program to find the second biggest element in an array.
//		System.out.println(Arrays.stream(nums).boxed().distinct().sorted(Comparator.reverseOrder())
//				.collect(Collectors.toList()).get(1));

		// Method 2
		// remove duplicate values
		ArrayList<Integer> list = new ArrayList<>();
		for (Integer i : nums) {
			if (!list.contains(i)) {
				list.add(i);
			}
		}
//		list.sort((n1, n2) -> n1.compareTo(n2));
//		list.sort(Comparator.naturalOrder());
//		list.forEach(n->System.out.println(n));
//		System.out.println(list.get(1));

		// Method 3
		ArrayList<Integer> list2 = new ArrayList<>();
		for (Integer i : nums) {
			if (!list2.contains(i)) {
				list2.add(i);
			}
		}
		int temp = 0;
		for (int i = 0; i < list2.size() - 1; i++) {
			for (int j = 0; j < list2.size()-i-1; j++) {
				if (list2.get(i) > list2.get(j)) {
					temp = list2.get(i);
					list2.add(i,list2.get(j));
					list2.add(j,temp);
				}
			}
		}
		list2.forEach(n->System.out.println(n));
//		System.out.println(list2.get(1));

	}

}
