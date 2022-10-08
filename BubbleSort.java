package algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of List n : ");
		int n = sc.nextInt();
		List<Integer> strList = new ArrayList<Integer>(n);
		System.out.println("Enter List Elements :");
		for (int i = 0; i < n; i++) {
			strList.add(sc.nextInt());
		}
		sc.close();

		System.out.println("Before Sorting List : " + strList.toString());
		System.out.println();
		sort(strList);
		System.out.println("After Sorting List : " + strList.toString());

	}

	static void sort(List<Integer> strList) {
		int n = strList.size();
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (strList.get(j - 1) > strList.get(j)) {
					temp = strList.get(j - 1);
					strList.set((j - 1), strList.get(j));
					strList.set(j, temp);
				}

			}
		}
	}
}
