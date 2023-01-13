package InterviewQuestions;

public class PrintStars {

	public static void main(String[] args) {
		String str = "";
		for (int i = 0; i < 5; i++) {
			str += "*";
			System.out.println(str);
		}
		for (int i = 4; i > 0; i--) {
			str = str.substring(0, i);
			System.out.println(str);
		}
	}
}
