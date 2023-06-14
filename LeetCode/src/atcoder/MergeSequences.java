package atcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeSequences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		int[] c = new int[n + m];
		Map<Integer, Integer> map = new HashMap<>();//数字、順番

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			a[i] = num;
			c[i] = num;

		}

		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			b[i] = num;
			c[i + n] = num;
		}

		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {
			map.put(c[i], i);
		}

		for (int i = 0; i < n; i++) {
			int ans = map.get(a[i]);
			System.out.print(ans + 1 + " ");

		}
		System.out.println();

		for (int i = 0; i < m; i++) {
			int ans = map.get(b[i]);
			System.out.print(ans + 1 + " ");
		}

	}
}
