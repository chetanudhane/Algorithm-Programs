package algorithmprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of List n : ");
		int n = sc.nextInt();
		List<String> strList = new ArrayList<String>(n);
		System.out.println("Enter List Elements :");
		for (int i = 0; i < n; i++) {
			strList.add(sc.next());
		}

		String[] inputArray = new String[strList.size()];
		for (int i = 0; i < strList.size(); i++) {
			inputArray[i] = strList.get(i);
		}
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(inputArray);
		sc.close();

		for (int i = 0; i < n; i++) {
			strList.set(i, inputArray[i]);
		}
		System.out.println("After Sorting List : " + strList.toString());

	}

	private void sort(String[] inputArray) {

		int i, j;
		String key;
		System.out.println("Before Sorting String Array : " + Arrays.toString(inputArray));

		for (j = 1; j < inputArray.length; j++) {
			key = inputArray[j];
			i = j - 1;
			while (i >= 0) {
				if (key.compareTo(inputArray[i]) > 0) {
					break;
				}
				inputArray[i + 1] = inputArray[i];
				i--;
			}
			inputArray[i + 1] = key;
		}

	}

}
