import java.security.SecureRandom;
import java.util.Scanner;

public class CAI1 {
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
				System.out.println("Very Good!");
			} else {
				System.out.println("No. Please try again.");
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
	}

