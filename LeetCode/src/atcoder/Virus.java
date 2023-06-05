package atcoder;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Virus {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] x = new int[n][2];
		boolean[] kansen = new boolean[n];

		for (int i = 0; i < n; i++) {
			x[i][0] = sc.nextInt();
			x[i][1] = sc.nextInt();

		}

		Deque<int[]> deque = new ArrayDeque<>();
		int[] arr = { x[0][0], x[0][1] };
		deque.push(arr);
		kansen[0] = true;

		//スタックに入れて、スタックから取り出したものでfor文回す
		while (!deque.isEmpty()) {
			int[] temp = deque.pop();
			int a1 = temp[0];
			int a2 = temp[1];

			for (int j = 0; j < n; j++) {

				if (kansen[j]) {
					continue;
				}

				int b1 = x[j][0];
				int b2 = x[j][1];

				double kyori = Math.sqrt(Math.pow(a1 - b1, 2) + Math.pow(a2 - b2, 2));

				if (d >= kyori) {
					kansen[j] = true;
					int[] arr2 = { b1, b2 };
					deque.push(arr2);
				}
			}
		}

		for (boolean b : kansen) {
			if (b) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}