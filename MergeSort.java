package algorithmprograms;

import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		List<String> strList = Arrays.asList("Cat", "Sweet", "Apple", "Mango", "Tiger", "Elephant", "Zebra", "Lion");
		int n = strList.size();
		String[] inputArray = new String[strList.size()];
		for (int i = 0; i < n; i++) {
			inputArray[i] = strList.get(i);
		}

		System.out.println("Before Sorting String Array is : " + Arrays.toString(inputArray));
		mergeSort(inputArray);
		System.out.println("Sorted String Array is : " + Arrays.toString(inputArray));

	}

	public static void mergeSort(String[] names) {
		if (names.length > 1) {
			String[] left = new String[names.length / 2];
			String[] right = new String[names.length - names.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = names[i];
			}

			for (int i = 0; i < right.length; i++) {
				right[i] = names[i + names.length / 2];
			}

			mergeSort(left);
			mergeSort(right);
			merge(names, left, right);
		}
	}

	public static void merge(String[] names, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < names.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				names[i] = left[a];
				a++;
			} else {
				names[i] = right[b];
				b++;
			}
		}
	}
}
