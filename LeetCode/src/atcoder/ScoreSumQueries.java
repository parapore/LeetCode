package atcoder;

import java.util.Scanner;

public class ScoreSumQueries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] one = new int[n][2];
		int[][] two = new int[n][2];

		int oneSum = 0;
		int twoSum = 0;

		//入力受け取り＆累積和
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int score = sc.nextInt();

			if (num == 1) {
				one[i][0] = i;
				oneSum += score;
				one[i][1] = oneSum;

				if (i != 0) {
					two[i][1] = two[i - 1][1];//間うめ
				}

			} else {
				two[i][0] = i;
				twoSum += score;
				two[i][1] = twoSum;

				if (i != 0) {
					one[i][1] = one[i - 1][1];//間うめ
				}

			}
		}

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {

			int s = sc.nextInt() - 1;
			int e = sc.nextInt() - 1;

			if (s == 0) {
				int oneAns = one[e][1] ;
				int twoAns = two[e][1];
				System.out.println(oneAns + " " + twoAns);
			} else {
				int oneAns = one[e][1] - one[s - 1][1];
				int twoAns = two[e][1] - two[s - 1][1];
				System.out.println(oneAns + " " + twoAns);
			}

		}
	}
}
