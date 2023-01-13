package JavaInterviewQuestions;

public class Question4 {

	public static void main(String[] args) {
		// 4 : Write a program to print the numbers in an array in descending order.
		int[] ascArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] descArray = new int[ascArray.length];
		int index = 0;
		for (int i = ascArray.length; i > 0; i--) {
			descArray[index] = ascArray[i - 1];
			index++;
		}
		System.out.print("Reversed array is : ");
		for (int i : descArray) {
			System.out.print(i);
		}

	}

}
