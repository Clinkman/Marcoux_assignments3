import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 {
	public static void main(String[] args) {
		int CorrectAnswer, Answer;
		String choice;
		Scanner sc = new Scanner(System.in);
			CorrectAnswer = askQuestion();
			Answer = 0;
			while(Answer != CorrectAnswer) {
			System.out.print("\nYour answer: ");
			Answer = sc.nextInt();
			if(Answer == CorrectAnswer) {
				displayCorrectResponse();
			} else {
				displayincorrectResponse();
				}
			}
			}
	//generate question
	public static int askQuestion() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		System.out.print("How much is " + num1 + " times " + num2 + "?");
		return num1 * num2;
	}
	
	public static void displayCorrectResponse()
	{
		int randnum;
		SecureRandom rand = new SecureRandom();
		switch (randnum = rand.nextInt(3)) {
		case 0:
		System.out.println("Very Good!");
		break;
		case 1:
		System.out.println("Excellent!");
		break;
		case 2:
		System.out.println("Nice work!");
		break;
		case 3:
		System.out.println("keep up the good work!");
		break;
		}
	}
	
	public static void displayincorrectResponse()
	{
		int randnum;
		SecureRandom rand = new SecureRandom();
		switch (randnum = rand.nextInt(3)) {
		case 0:
		System.out.println("No. Please try again.");
		break;
		case 1:
		System.out.println("Wrong. Try once more");
		break;
		case 2:
		System.out.println("Don't give up!");
		break;
		case 3:
		System.out.println("No. Keep trying.");
		break;
	}
	}
}
