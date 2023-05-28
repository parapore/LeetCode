package algosiki;

import java.util.Arrays;
import java.util.Scanner;

public class NimotuToHako {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nimotu = new int[n];
		int[] box = new int[m];
		boolean[] used = new boolean[n];

		for (int i = 0; i < n; i++) {
			nimotu[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			box[i] = sc.nextInt();
		}

		Arrays.sort(nimotu);
		Arrays.sort(box);

		int count = 0;
		for (int i = m - 1; i >= 0; i--) {
			int num = box[i];
			for (int j = n - 1; j >= 0; j--) {//使った荷物は使用済みにしたい

				if (num - nimotu[j] >= 0 && used[j] == false) {
//					num -= nimotu[j];
					used[j] = true;
					count++;
					break;
				}

			}

		}
		System.out.println(count);
	}
}
