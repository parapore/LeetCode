package atcoder;

import java.util.Scanner;

//DFSテンプレート。主に図形問題用。
public class DFSTemplate {
	private static int h;
	private static int w;
	private static int ans;
	private static int[][] a;
	private static boolean[][] seen;

	//引数に座標を渡すのがポイント。
	//再帰で前スレッドに戻ったとき、前の座標に戻れる
	private static void dfs(int y, int x) {
		
		
		// ベース条件。右端に到達したらおわり
		if (x == w - 1 && y == h - 1) {
			ans++;
			return;
		}

		//8方向移動
		int[] dy = {1,0,-1,0,1,1,-1,-1};
		int[] dx = {0,1,0,-1,1,-1,1,-1};

		for (int i = 0; i < 8; i++) {
			int yy = y + dy[i];
			int xx = x + dx[i];

			if (yy < 0 || yy >= h || xx < 0 || xx >= w || seen[yy][xx]) {//回避条件。ここに色々詰め込む
				continue;
			}
			seen[yy][xx] = true;//探索済みに追加
			dfs(yy, xx);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		a = new int[h][w];
		seen = new boolean[h][w];

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				a[i][j] = sc.nextInt();
			}

		}

		seen[0][0] = true;
		dfs(0, 0);

		System.out.println(ans);

	}
}
