import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 {
	public static void main(String[] args) {
		quiz();
			}
	public static void quiz() {
		int CorrectAnswer, Answer;
		int Right, Wrong;
		String choice;
		Scanner sc = new Scanner(System.in);
			Answer = 0;
			Right = 0;
			Wrong = 0;
			for (int i = 1; i < 11; i++) {
			System.out.println(i +". ");
			CorrectAnswer = askQuestion();
			System.out.print("\nYour answer: ");
			Answer = sc.nextInt();
			if(Answer == CorrectAnswer) {
				displayCorrectResponse();
				Right++;
			} else {
				displayincorrectResponse();
				Wrong++;
				}
			}
			if(Right > 7)
			{
				System.out.println("Congratulations, you are ready to go to the next level!");
				quiz();
			} else {
				System.out.println("Please ask your teacher for extra help.");
				quiz();
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
		switch (randnum = rand.nextInt(4)) {
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
		switch (randnum = rand.nextInt(4)) {
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

