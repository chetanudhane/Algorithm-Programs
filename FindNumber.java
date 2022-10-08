package algorithmprograms;

import java.util.Scanner;

public class FindNumber {

	public static void main(String[] args) {
		FindNumber findYourNumber = new FindNumber();
		findYourNumber.findNumber();
	}

	public void findNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number To Search : ");
		int number = scanner.nextInt();
		System.out.println("Think a number in between range(0," + (number + 1) + ")");
		System.out.println("Answer in yes, low, high");
		int low = 0;
		int high = number + 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			System.out.println("Is your number " + middle + " ?");
			String input = scanner.nextLine();
			input = input.toLowerCase();
			if (input.equals("yes")) {
				System.out.println("Your number is " + middle);
				System.exit(0);
			} else if (input.equals("low")) {
				high = middle - 1;
			}

			else if (input.equals("high")) {
				low = middle + 1;
			}
		}
		System.out.println("Number not found");
		scanner.close();
	}

}
