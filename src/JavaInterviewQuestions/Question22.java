package JavaInterviewQuestions;

import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		try (// Write a Program to Display Fibonacci Series  
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter a number :");
			int num = sc.nextInt();	
//			int num2 = 0;
			int fSeries = 0;
			for(int i = 1;i<num;i++) {
//				num2= i;
//				fSeries=i+i;
				
				System.out.println(fSeries);
			}
		}
	}

}
