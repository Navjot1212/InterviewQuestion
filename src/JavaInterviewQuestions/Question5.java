package JavaInterviewQuestions;

public class Question5 {

	public static void main(String[] args) {
		// 5 : Write a program to replace the numbers in an array with alphabets.
		int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < numArray.length; i++) {
			switch (numArray[i]) {
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("Six");
				break;
			case 7:
				System.out.println("Seven");
				break;
			case 8:
				System.out.println("Eight");
				break;
			default:
				System.out.println("Nine");
				break;
			}
		}
	}
}
