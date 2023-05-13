package atcoder;

import java.util.Scanner;

public class AtCoderCards {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int[] arr = new int[27];
		int[] arr2 = new int[27];

		char[] sarr = s.toCharArray();
		char[] tarr = t.toCharArray();

		for (char c : sarr) {
			if (c == '@') {
				arr[26]++;
			} else {
				arr[c - 97]++;
			}
		}

		for (char c : tarr) {
			if (c == '@') {
				arr2[26]++;
			} else {
				arr2[c - 97]++;
			}
		}

		int count = 0;
		int atcount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				atcount = arr[i] + arr2[i];

			} else {
				int diff = Math.abs(arr[i] - arr2[i]);
				if (diff > 0 && i != 0 && i != 19 && i != 2 && i != 14 && i != 3 && i != 4 && i != 17) {
					System.out.println("No");
					return;
				}
				count += diff;
			}
		}
		if (atcount >= count) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
