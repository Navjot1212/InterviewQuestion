package InterviewQuestions;

public class ArrayComparison {

	public static void main(String[] args) {
		// Find the missing number in second array
		int[] num1 = { 1, 2, 3, 4, 5 };
		int[] num2 = { 2, 3, 1, 5 };
		int sum = 0;
		for (int i : num1) {
			sum += i;
		}
		for (int i : num2) {
			sum -= i;
		}
		System.out.println("Missing number is "+sum);
	}
}