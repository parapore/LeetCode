package algosiki;

import java.util.Scanner;

public class Ruisekiwa5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// 長さごとの配列を作る
		int[] himoLength = new int[(int) Math.pow(10, 5) + 1];

		for (int i = 0; i < n; i++) {
			himoLength[sc.nextInt()]++;
		}

		int[] ruisekiwa = new int[(int) Math.pow(10, 5) + 1];
		ruisekiwa[0] = 1;
		int count = 0;
		for (int i = 1; i < himoLength.length; i++) {

			ruisekiwa[i] = ruisekiwa[i - 1] + himoLength[i];

		}

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			int low = sc.nextInt();
			int high = sc.nextInt();

			System.out.println(ruisekiwa[high] - ruisekiwa[low - 1]);

		}

	}

}
