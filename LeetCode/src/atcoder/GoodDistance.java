package atcoder;

import java.util.Scanner;

public class GoodDistance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[][] arr = new int[n][d];
		int[] arr2 = new int[d];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < d; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int count = 0;
		double temp = 0;
		for (int i = 0; i < n - 1; i++) {//外側2次元配列の1つ目
			for (int k = i + 1; k < n; k++) {//内側2次元配列の1つ目
				temp = 0;
				for (int l = 0; l < d; l++) {// 内側外側2次元配列の2つ目
					temp += Math.pow(arr[i][l] - arr[k][l], 2);
				}
				temp = Math.sqrt(temp);
				if (temp % 1 == 0) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}
