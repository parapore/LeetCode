package atcoder;

import java.util.Scanner;

public class Equation {
	private static double binarySearch(int n) {
		double left = 1;
		double right = n;
		double middle = 0;

		while (left <= right) {
			middle = (left + right) / 2;
			double x = (double)(Math.round((Math.pow(middle, 3) + middle) * 1000)) / 1000;

			if (x > n) {
				right = middle - 0.001;
			}

			if (x == n) {
				return middle;
			}

			if (x < n) {
				left = middle + 0.001;
			}
		}
		return middle;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double ans = binarySearch(n);
		System.out.println(ans);

	}

}
