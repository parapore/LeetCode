package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlmostEqual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<int[]> list = new ArrayList<>();
		List<char[]> charList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			char[] arr2 = sc.next().toCharArray();
			charList.add(arr2);

			int[] arr = new int[26];

			for (char c : arr2) {
				arr[(int) (c - 'a')]++;
			}

			list.add(arr);
		}

		// 2つだけ違えばOK。２重で全探索
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			int[] arr3 = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				int[] arr4 = list.get(j);

				int sai = 0;
				for (int k = 0; k < 26; k++) {
					sai = sai + Math.abs(arr3[k] - arr4[k]);
				}
				if (sai == 2) {
					count++;
				}
			}
		}
		if (count >= n-1) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
