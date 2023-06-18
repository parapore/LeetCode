package atcoder;

import java.util.Scanner;

public class BinarySearch1 {
	private static int n;
	private static int x;
	private static int[] a;

	private static int binarySearch() {
		int left = 1;
		int right = n;

		while (left <= right) {//探索範囲がなくなるまで
			int middle = (left + right) / 2;//配列の真ん中

			if (x < a[middle]) {//配列の真ん中の値よりXが小さい場合
				right = middle - 1;
			}

			if (x == a[middle]) {
				return middle + 1;
			}

			if (x > a[middle]) {//配列の真ん中の値よりXが大きい場合
				left = middle + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = sc.nextInt();
		a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println(binarySearch());

	}

}
