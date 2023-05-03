package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// WrongAnswer
public class Traveling2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[]> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int[] arr = new int[4];
			if (i == 0) {
				arr[0] = sc.nextInt();
				arr[1] = sc.nextInt();
				arr[2] = sc.nextInt();
				arr[3] = Math.abs(arr[1]) + Math.abs(arr[2]);
			} else {
				int[] before = list.get(i - 1);
				arr[0] = sc.nextInt() - before[0];
				arr[1] = sc.nextInt();
				arr[2] = sc.nextInt();
				arr[3] = Math.abs(arr[1] - before[1]) + Math.abs(arr[2] - before[2]);
			}
			list.add(arr);
		}

		boolean b = true;
		// 偶数奇数の一致＆秒数が移動距離に足りてるか
		for (int[] arr2 : list) {

			if (arr2[0] < arr2[3]) {
				System.out.println("No");
				return;
			}

			if (arr2[0] % 2 != arr2[3] % 2) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
