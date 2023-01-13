package JavaInterviewQuestions;

public class Question8 {

	public static void main(String[] args) {
		// 8 : Write a program to find smallest and largest number in an array.
		int[] numArray = { 5, 3, 7, 2, 8, 1, 9, 0, 4, -9, -7 };
		int minNum = numArray[0];
		int maxNum = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > maxNum) {
				maxNum = numArray[i];
			}
			if (numArray[i] < minNum) {
				minNum = numArray[i];
			}
		}
		System.out.println("Smallest number in array is " + minNum);
		System.out.println("Largest number in array is " + maxNum);
	}
}
