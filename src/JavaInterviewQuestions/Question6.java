package JavaInterviewQuestions;

public class Question6 {

	public static void main(String[] args) {
		// 6 : Write a program to replace 2 number without using third variable.
		int num1 = 123;
		int num2 = 456;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
}
