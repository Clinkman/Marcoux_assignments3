import java.security.SecureRandom;
import java.util.Scanner;

public class CAI5 {
	public static void main(String[] args) {
		quiz();
			}
	public static void quiz() {
		SecureRandom rand = new SecureRandom();
		int r;
		double Answer;
		double CorrectAnswer;
		int Right;
		int level;
		int option;
		String choice;
		Scanner sc = new Scanner(System.in);
		CorrectAnswer = 0;
			Answer = 0;
			Right = 0;
			System.out.println("What option? ");
			option = sc.nextInt();
			System.out.println("What difficulty level? ");
			level = sc.nextInt();
			for (int i = 1; i < 11; i++) {
			System.out.println(i +". ");
			// the different options and levels
			if(option == 1) {
				if(level == 1) {
					CorrectAnswer = askQuestionAlevel1();
				}
				if(level == 2) {
					CorrectAnswer = askQuestionAlevel2();
				}
				if(level == 3) {
					CorrectAnswer = askQuestionAlevel3();
				}
				if(level == 4) {
					CorrectAnswer = askQuestionAlevel4();
				}
			}
			if(option == 2) {
				if(level == 1) {
					CorrectAnswer = askQuestionMlevel1();
				}
				if(level == 2) {
					CorrectAnswer = askQuestionMlevel2();
				}
				if(level == 3) {
					CorrectAnswer = askQuestionMlevel3();
				}
				if(level == 4) {
					CorrectAnswer = askQuestionMlevel4();
				}
			}
			if(option == 3){
				if(level == 1) {
					CorrectAnswer = askQuestionSlevel1();
				}
				if(level == 2) {
					CorrectAnswer = askQuestionSlevel2();
				}
				if(level == 3) {
					CorrectAnswer = askQuestionSlevel3();
				}
				if(level == 4) {
					CorrectAnswer = askQuestionSlevel4();
				}
			}
			if(option == 4) {
				if(level == 1) {
					CorrectAnswer = askQuestionDlevel1();
				}
				if(level == 2) {
					CorrectAnswer = askQuestionDlevel2();
				}
				if(level == 3) {
					CorrectAnswer = askQuestionDlevel3();
				}
				if(level == 4) {
					CorrectAnswer = askQuestionDlevel4();
				}
			}
			if(option == 5) {
				if(level == 1) {
					switch(r = rand.nextInt(4)) {
					case 0:
					CorrectAnswer = askQuestionAlevel1();
					break;
					case 1:
					CorrectAnswer = askQuestionMlevel1();
					break;
					case 2:
					CorrectAnswer = askQuestionSlevel1();
					break;
					case 3:
					CorrectAnswer = askQuestionDlevel1();
					break;
					}
				}
				if(level == 2) {
					switch(r = rand.nextInt(4)) {
					case 0:
					CorrectAnswer = askQuestionAlevel2();
					break;
					case 1:
					CorrectAnswer = askQuestionMlevel2();
					break;
					case 2:
					CorrectAnswer = askQuestionSlevel2();
					break;
					case 3:
					CorrectAnswer = askQuestionDlevel2();
					break;
					}
				}
				if(level == 3) {
					switch(r = rand.nextInt(4)) {
					case 0:
					CorrectAnswer = askQuestionAlevel3();
					break;
					case 1:
					CorrectAnswer = askQuestionMlevel3();
					break;
					case 2:
					CorrectAnswer = askQuestionSlevel3();
					break;
					case 3:
					CorrectAnswer = askQuestionDlevel3();
					break;
					}
				}
				if(level == 4) {
					switch(r = rand.nextInt(4)) {
					case 0:
					CorrectAnswer = askQuestionAlevel4();
					break;
					case 1:
					CorrectAnswer = askQuestionMlevel4();
					break;
					case 2:
					CorrectAnswer = askQuestionSlevel4();
					break;
					case 3:
					CorrectAnswer = askQuestionDlevel4();
					break;
					}
				}
			}
			System.out.print("\nYour answer: ");
			Answer = sc.nextDouble();
			if(Answer == CorrectAnswer) {
				displayCorrectResponse();
				Right++;
			} else {
				displayincorrectResponse();
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
	
	public static int askQuestionAlevel1() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		System.out.print("How much is " + num1 + " plus " + num2 + "?");
		return num1 + num2;
	}
	
	public static int askQuestionAlevel2() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
		System.out.print("How much is " + num1 + " plus " + num2 + "?");
		return num1 + num2;
	}
	
	public static int askQuestionAlevel3() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(1000);
		num2 = rand.nextInt(1000);
		System.out.print("How much is " + num1 + " plus " + num2 + "?");
		return num1 + num2;
	}
	
	public static int askQuestionAlevel4() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10000);
		num2 = rand.nextInt(10000);
		System.out.print("How much is " + num1 + " plus " + num2 + "?");
		return num1 + num2;
	}
	//generate level 1 question
	public static int askQuestionMlevel1() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		System.out.print("How much is " + num1 + " times " + num2 + "?");
		return num1 * num2;
	}
	
	public static int askQuestionMlevel2() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
		System.out.print("How much is " + num1 + " times " + num2 + "?");
		return num1 * num2;
	}
	
	public static int askQuestionMlevel3() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(1000);
		num2 = rand.nextInt(1000);
		System.out.print("How much is " + num1 + " times " + num2 + "?");
		return num1 * num2;
	}
	
	public static int askQuestionMlevel4() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10000);
		num2 = rand.nextInt(10000);
		System.out.print("How much is " + num1 + " times " + num2 + "?");
		return num1 * num2;
	}
	
	public static int askQuestionSlevel1() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		System.out.print("How much is " + num1 + " minus " + num2 + "?");
		return num1 - num2;
	}
	
	public static int askQuestionSlevel2() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
		System.out.print("How much is " + num1 + " minus " + num2 + "?");
		return num1 - num2;
	}
	
	public static int askQuestionSlevel3() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(1000);
		num2 = rand.nextInt(1000);
		System.out.print("How much is " + num1 + " minus " + num2 + "?");
		return num1 - num2;
	}
	
	public static int askQuestionSlevel4() {
		int num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10000);
		num2 = rand.nextInt(10000);
		System.out.print("How much is " + num1 + " minus " + num2 + "?");
		return num1 - num2;
	}
	
	public static double askQuestionDlevel1() {
		double num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);
		System.out.print("How much is " + num1 + " divided " + num2 + "?");
		return num1 / num2;
	}
	
	public static double askQuestionDlevel2() {
		double num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(100);
		num2 = rand.nextInt(100);
		System.out.print("How much is " + num1 + " divided " + num2 + "?");
		return num1 / num2;
	}
	
	public static double askQuestionDlevel3() {
		double num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(1000);
		num2 = rand.nextInt(1000);
		System.out.print("How much is " + num1 + " divided " + num2 + "?");
		return num1 / num2;
	}
	
	public static double askQuestionDlevel4() {
		double num1, num2;
		SecureRandom rand = new SecureRandom();
		num1 = rand.nextInt(10000);
		num2 = rand.nextInt(10000);
		System.out.print("How much is " + num1 + " divided " + num2 + "?");
		return num1 / num2;
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
