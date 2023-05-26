package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManyRequirements {
	private static int n;
	private static int max;
	private static int q;
	private static int[] a;
	private static int[] b;
	private static int[] c;
	private static int[] d;
	private static List<Integer> list = new ArrayList<>();
	private static int answer = 0;

	private static void dfs() {

		//ベース条件
		if (list.size() == n) {
			//合計点計算に飛ぶ
			calc();
			return;
		}

		
		if(list.size() == 0) {
			list.add(1);
		}
		// 再帰で数列を作る。jの値は広義単調増加。重複OK。
		for (int j = list.get(list.size()-1); j <= max; j++) {
//			if (list.size() == 0 || (list.get(list.size() -1) <= j)) {
				list.add(j);
				dfs();
				list.remove(list.size() - 1);
//			}
		}
	}

	private static void calc() {

		int sum = 0;
		for (int i = 0; i < q; i++) {
			int bb = list.get(b[i]-1);
			int aa = list.get(a[i]-1);
			if (bb - aa == c[i]) {
				sum += d[i];
			}
		}

		answer = Math.max(sum, answer);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		max = sc.nextInt();
		q = sc.nextInt();

		a = new int[q];
		b = new int[q];
		c = new int[q];
		d = new int[q];

		for (int i = 0; i < q; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
			d[i] = sc.nextInt();
		}
		dfs();
		System.out.println(answer);

	}
}
