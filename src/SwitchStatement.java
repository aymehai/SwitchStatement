import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Each month has either 28, 30, or 31 days during a common year");
		System.out.println("Please enter \"28\" \"30\" or \"31\"");
		int daysInMonth = keyboard.nextInt();
		switch (daysInMonth) {
		case 30:
			System.out.println("September April June November");
			break;
		case 31:
			System.out.println("January March May July August October December");
			break;
		case 28:
			System.out.println("February");
			break;
		default:
			System.out.println("Please enter in \"28\" \"30\" or \"31\"");
			break;
		}
	}
}
