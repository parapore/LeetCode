package atcoder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coverage {
	static int n;
	static int m;
	static int c;
	//	static int[] a;
	static boolean[] seen;
	static boolean[] check;
	static int ans;
	static List<int[]> list = new ArrayList<>();
	static List<int[]> checkList = new ArrayList<>();
	static int matubi;

	//組合せ全探索
	private static void dfs(int index) {

		if (checkList.size() > 0 && doCheck()) {
			ans++;
		}
		check = new boolean[n];//初期化

		if (checkList.size() > 0) {
			index += 1;
		}
		for (int i = index; i < m; i++) {

			if (seen[i]) {
				continue;
			}

			checkList.add(list.get(i));
			seen[i] = true;
			dfs(i);
			checkList.remove(checkList.size() - 1);
			seen[i] = false;
		}
	}

	//N以下の整数が全て含まれているか？
	private static boolean doCheck() {

		for (int[] aa : checkList) {
			for (int num : aa) {
				check[num - 1] = true;
			}
		}

		//全てTrueならTrue
		for (boolean b : check) {
			if (!b) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		seen = new boolean[m];
		check = new boolean[n];

		for (int i = 0; i < m; i++) {
			c = sc.nextInt();
			int[] a = new int[c];

			for (int j = 0; j < c; j++) {
				a[j] = sc.nextInt();

			}
			list.add(a);
		}
		dfs(0);

		System.out.println(ans);

	}
}