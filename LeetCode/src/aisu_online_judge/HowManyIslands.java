package aisu_online_judge;

import java.util.Scanner;

public class HowManyIslands {
	private static int w;
	private static int h;
	private static int[][] arr;
	private static boolean[][] seen;

	private static void dfs(int hh, int ww) {
		
		seen[hh][ww] = true;//探索済みにする
		int[] yokoIdou = {1,0,-1,0,1,1,-1,-1};
		int[] tateIdou = {0,1,0,-1,1,-1,1,-1};

		// ８方向探索
		for (int i = 0; i < 8; i++) {
			int hhh = hh + tateIdou[i];
			int www = ww + yokoIdou[i];
			
			if (hhh < 0 || hhh >= h || www < 0 || www >= w || seen[hhh][www] || arr[hhh][www] == 0) {
				continue;
			}

			dfs(hhh, www);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keizoku = true;
		do{
			w = sc.nextInt();
			h = sc.nextInt();
			arr = new int[h][w];
			seen = new boolean[h][w];
			
			if(w == 0 && h == 0) {
				keizoku = false;
				break;
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int count = 0;
			//陸かつ未探索ならスタート
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (arr[i][j] == 1 && seen[i][j] == false) {
						count++;
						dfs(i, j);
					}
				}
			}
			System.out.println(count);
		}while(keizoku);

	}
}
