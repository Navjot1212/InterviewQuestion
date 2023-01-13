package InterviewQuestions;

public class GeneratingRandomEmail {

	public static void main(String[] args) {
		String email = "";
		String alphabets = "abcdefghijklmnopqrstuvwxyz";
		String[] domain = { "gmail.com", "yahoo.com", "icloud.com", "outlook.com" };
		for (int i = 0; i < 6; i++) {
			email += alphabets.charAt((int) (Math.random()*alphabets.length()));
		}
		email+= (int) (Math.random()*1000);
		email+="@"+domain[(int) (Math.random()*domain.length)];
		System.out.println(email);
	}
}
