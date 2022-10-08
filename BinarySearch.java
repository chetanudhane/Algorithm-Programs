package algorithmprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) throws IOException {

		List<String> file = new ArrayList<String>();

		BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/mayur/Desktop/abc.txt"));
		String saveLine;
		while ((saveLine = bufferedReader.readLine()) != null) {
			file.add(saveLine);
		}
		bufferedReader.close();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key: ");
		String input = sc.nextLine();
		BinarySearch binarySearch = new BinarySearch();
		Arrays.sort(file.toArray());
		System.out.println(file);
		int index = binarySearch.binarySearchString(file, input);
		if (index == -1) {
			System.out.println("Word Not found in file : " + input);
		} else {
			System.out.println("Word found in file : " + input);
		}
		sc.close();
	}

	private int binarySearchString(List<String> name, String key) {
		int first = 0;
		int last = name.size();

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo((String) name.toArray()[mid]) < 0) {
				last = mid;
				return last;
			} else if (key.compareTo((String) name.toArray()[mid]) > 0) {
				first = mid + 1;
				return first;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
