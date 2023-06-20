package atcoder;

import java.util.ArrayList;
import java.util.List;

//多重for文を再帰で作る練習
public class RecursiveFunctionPractice {
	private static List<Integer> list = new ArrayList<>();
	private static boolean[] seen = new boolean[5];

	// 重複あり全探索。0～2の数字を含む、N桁の数列を全通り作る
	private static void recursion1(int N) {
		//ベース条件（終了条件）
		// Nが２なら２重for。Nが３なら３重for文になる。
		if (list.size() == N) {
			for (int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < 3; i++) {
			list.add(i);
			recursion1(N);
			list.remove(list.size() - 1);// 末尾を削除。ここがポイント
		}

	}

	// 重複なし全探索。順列全探索。0～2の数字を含む、N桁の数列を作る
	private static void recursion2(int N) {
		//ベース条件（終了条件）
		// Nが２なら２重for。Nが３なら３重for文になる。
		if (list.size() == N) {
			for (int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < 3; i++) {
			if (seen[i]) {
				continue;
			}
			list.add(i);
			seen[i] = true;
			recursion2(N);
			list.remove(list.size() - 1);// 末尾を削除。ここがポイント
			seen[i] = false;
		}

	}

	// 重複なし全探索。組合せ全探索。0～2の数字を含む、N桁の数列を作る
	private static void recursion3(int N) {
		//ベース条件（終了条件）
		// Nが２なら２重for。Nが３なら３重for文になる。
		if (list.size() == N) {
			for (int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}

		//順列全探索との違い
		// Listが空でないなら前の数字＋１をnumに代入
		int num = 0;
		if (list.size() > 0) {
			num = list.get(list.size() - 1) + 1;
		}
		for (int i = num; i < 5; i++) {
			list.add(i);
			recursion3(N);
			list.remove(list.size() - 1);// 末尾を削除。ここがポイント
		}

	}

	public static void main(String[] args) {
		recursion1(3);

		System.out.println();

		recursion2(3);

		System.out.println();

		recursion3(3);

		//重複あり全探索。3*3*3＝27通り
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}

		System.out.println();

		//重複なし全探索。順列。3P3 = 3! = 6通り
		boolean[] used = new boolean[3];
		for (int i = 0; i < 3; i++) {
			if (used[i]) {
				continue;
			}
			used[i] = true;
			for (int j = 0; j < 3; j++) {
				if (used[j]) {
					continue;
				}
				used[j] = true;
				for (int k = 0; k < 3; k++) {
					if (used[k]) {
						continue;
					}
					used[k] = true;
					System.out.println(i + " " + j + " " + k);
					used[k] = false;
				}
				used[j] = false;
			}
			used[i] = false;
		}

		System.out.println();

		//重複なし全探索。組合せ。3C3 = 3*2*1 / 3*2*1 = 1通り
		for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				for (int k = j + 1; k < 3; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}

		System.out.println();

		//重複なし全探索。組合せ2。5C3 = 5*4*3 / 3*2*1 = 10通り
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				for (int k = j + 1; k < 5; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
	}
}
