package InterviewQuestions;

public class DivisibleQuestion {

	public static void main(String[] args) {
		for(int i = 1; i<100; i++) {
		if (i%3==0&&i%5==0) {
			System.out.println(i+" is multiple of both 3 and 5");
		}else if (i%3==0) {
			System.out.println(i+" is multiple of 3");
		}else if (i%5==0) {
			System.out.println(i+" is multiple of 5");
		}else {
			System.out.println(i+" is NOT multiple of either 3 or 5");
		}
		}
	}

}
