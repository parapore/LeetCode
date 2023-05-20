package atcoder;

import java.util.Scanner;

public class DepthFirstSearch2 {
	private static int H;
	private static int W;
	private static String[][] arr;
	private static boolean[][] seen;
	private static boolean answer = false;
	
	
	private static void dfs(int hi, int wi) {
		seen[hi][wi] = true;//探索済みとしてマーク

		int[] tateIdou = { 0, 1, 0, -1 };
		int[] yokoIdou = { 1, 0, -1, 0 };



		for (int i = 0; i < 4; i++) {

			int hh = hi + tateIdou[i];//移動先のY座標
			int ww = wi + yokoIdou[i];//移動先のX座標

			if (hh < 0 || hh >= H || ww < 0 || ww >= W || seen[hh][ww] || arr[hh][ww].equals("#")) {
				continue;
			}

			
			if(arr[hh][ww].equals("g")) {
				answer = true;
				return;
			}
			dfs(hh, ww);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		arr = new String[H][W];
		seen = new boolean[H][W];
		
		
		for (int i = 0; i < H; i++) {
			arr[i] = sc.next().split("");
		}

		int hi = -1;
		int wi = -1;
		for (int i = 0; i < H; i++) {
			if (hi != -1) {
				break;
			}
			for (int j = 0; j < W; j++) {
				if (arr[i][j].equals("s")) {//START探索
					hi = i;
					wi = j;
					break;

				}
			}
		}

		dfs(hi, wi);
		if(answer) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
