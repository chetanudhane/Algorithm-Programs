package algorithmprograms;

public class PrimeNumbersInRange {

	public static void main(String[] args) {

		System.out.println("All Prime Numbers Between 0 And 1000 Are : ");
		primeChecker();
	}

	private static void primeChecker() {
		int n = 1000;
		for (int j = 1; j <= n; j++) {
			boolean prime = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					prime = false;
				}
			}
			if (prime) {
				System.out.print(j + " ");
			}
		}
	}
}
