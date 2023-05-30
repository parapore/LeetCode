package atcoder;

import java.util.Scanner;

public class Pyramid {

	// Wrong Answer
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}

		//中心座標CX　CYを全探索
		for (int cx = 0; cx <= 100; cx++) {
			for (int cy = 0; cy <= 100; cy++) {
				int prevH = -1;
				boolean b = true;
				for (int i = 0; i < n; i++) {
					int xx = x[i];
					int yy = y[i];
					int hh = h[i];

					// 中心Xと中心Yが決まれば中心Hは決まる
					int nowH = hh + Math.abs(xx - cx) + Math.abs(yy - cy);

					if ((nowH != prevH && prevH != -1) || nowH < 1) {
						b = false;
						break;
					}
					prevH = nowH;
				}

				if (b) {
					System.out.println(cx + " " + cy + " " + prevH);
					return;
				}
			}
		}

	}
}
