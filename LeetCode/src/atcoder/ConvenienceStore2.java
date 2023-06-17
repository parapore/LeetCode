package atcoder;

import java.util.Scanner;

//累積和。時刻毎の出勤者数を答える問題。
public class ConvenienceStore2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n = sc.nextInt();
		int[] zenjituhi = new int[t + 1];
		int[] ruiseki = new int[t];

		for (int i = 0; i < n; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();

			// これだとTLE。L日目～R日目まで出勤者数を＋１していく。全体の計算量N*T
			//			for(int j = l; l <= r; j++) {
			//				ruiseki[j]++;
			//			}

			zenjituhi[l]++;
			zenjituhi[r]--;
		}

		//前日比を元に出勤者数を作る。全体の計算量N+Tになる。
		for (int i = 0; i < t; i++) {
			if (i == 0) {
				ruiseki[i] = zenjituhi[i];
			} else {
				ruiseki[i] = ruiseki[i - 1] + zenjituhi[i];
			}

		}

		for (int ans : ruiseki) {
			System.out.println(ans);
		}

	}
}
