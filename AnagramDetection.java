package algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String string1: ");
		String string1 = sc.nextLine();
		System.out.println("Enter the String string2: ");
		String string2 = sc.nextLine();
		isAnagramString(string1, string2);
		sc.close();
	}

	public static void isAnagramString(String string1, String string2) {
		boolean status = true;
		if (string1.length() != string2.length()) {
			status = false;
		} else {
			char[] char1 = string1.toLowerCase().toCharArray();
			char[] char2 = string2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			status = Arrays.equals(char1, char2);
		}
		if (status) {
			System.out.println("Both the Strings are Anagram");
		} else {
			System.out.println("The above Strings are not Anagram ");
		}
	}
}
