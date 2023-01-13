package JavaInterviewQuestions;

public class Question12 {

	public static void main(String[] args) {
		// 12: Write a program to find if an array is mountain array or not?
		int[] mountainArray = { 1, 2, 3, 7, 6, 3, 2, 1 };
		int[] mountainArray1 = { 1, 2, 1, 1, 7, 6, 3, 2, 1 };
		
		System.out.println(isArrayMountain(mountainArray));
		System.out.println(isArrayMountain(mountainArray1));
		
	}

	public static boolean isArrayMountain(int[] numArray) {
		if (numArray.length < 3) {
			return false;
		}
		int i;
		for (i = 0; i < numArray.length - 1; i++) {
			if (numArray[i] >= numArray[i + 1]) {
				break;
			}
		}
		if (i == numArray.length - 1) {
			return false;
		}
		for (; i < numArray.length - 1; i++) {
			if (numArray[i] <= numArray[i + 1]) {
				break;
			}
		}
		if (i == numArray.length - 1) {
			return true;
		}
		return false;
	}

}
