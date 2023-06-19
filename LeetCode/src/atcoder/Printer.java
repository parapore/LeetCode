package atcoder;

import java.util.Scanner;

public class Printer {
	private static int binarySearch(int n, int k, int[] a) {
		int left = 1;
		int right = 1000000009;

		while (left < right) {
			int middle = (left + right) / 2;

			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum += middle / a[i];//床関数
			}

			if (sum >= k) {
				right = middle;
			}

			if (sum < k) {
				left = middle + 1;
			}
		}
		return right;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(binarySearch(n, k, a));

	}
}
