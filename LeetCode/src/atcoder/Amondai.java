package atcoder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Amondai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new LinkedHashMap<>();//自分、深さ
		int[][] arr = new int[2 * n + 1][1];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt() - 1;
			arr[i * 2 + 1][0] = arr[a][0] + 1;
			arr[i * 2 + 2][0] = arr[a][0] + 1;

		}

		for (int i = 0; i < 2 * n + 1; i++) {
			System.out.println(arr[i][0]);

		}
	}
}
