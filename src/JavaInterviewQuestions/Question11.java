package JavaInterviewQuestions;

public class Question11 {

	public static void main(String[] args) {
		// 11: Write a program to sort an array of number.
		int[] numArray = { 5, 3, 7, 2, 8, 1, 9, 0, 4 };
		int tempNum = 0;
		for (int i = 0; i < numArray.length; i++) {
			for (int j = i; j < numArray.length; j++) {
				if (numArray[i] > numArray[j]) {
					tempNum = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = tempNum;
				}
			}
		}
		System.out.print("Sorted array : ");
		for (int i : numArray) {
			System.out.print(i);
		}
	}
}
