package atcoder;

import java.util.Scanner;

public class Umetate {
	private static boolean[][] seen;
	private static int Y = 10;
	private static int X = 10;
	private static char[][] arr = new char[10][10];
	
	//置いた島と繋がる島を全探索。seen=trueにするのが目的
	private static void dfs(int y, int x) {
		seen[y][x] = true;
		
		int[] dy = {1,0,-1,0};
		int[] dx = {0,-1,0,1};
		
		for(int i = 0; i < 4; i++) {
			int yy = y + dy[i];
			int xx = x + dx[i];
			
			if(yy < 0 || yy >= Y || xx < 0 || xx >= X
				|| arr[yy][xx] == 'x' || seen[yy][xx]) {
				continue;
			}
			
			dfs(yy,xx);
		}

		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.next().toCharArray();
		}
		
		//海に島を置く
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(arr[i][j] == 'x') {
					//海に島を置く
					arr[i][j] = 'o';
					
					// seenのクリア
					seen = new boolean[10][10];
					
					dfs(i, j);
					
					//島を海に戻す
					arr[i][j] = 'x';
					
					// 他に未探索の島がないか探す
					int count = 0;
					for (int k = 0; k < 10; k++) {
						for (int l = 0; l < 10; l++) {
							if(arr[k][l] == 'o' && seen[k][l] == false) {
								count++;
								break;
							}
						}
					}
					if(count == 0) {
						System.out.println("YES");
						return;
					}

				}
			}
		}
		System.out.println("NO");

	}
}
