package atcoder;

import java.util.Scanner;

public class SnuketheCookiePicker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		char[][] arr = new char[h][w];

		for (int i = 0; i < h; i++) {
			arr[i] = sc.next().toCharArray();
		}

		boolean start = false;
		int startx = Integer.MAX_VALUE;
		int starty = Integer.MAX_VALUE;
		int endx = 0;
		int endy = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j] == '#') {
					startx = Math.min(startx, j);
					starty = Math.min(starty, i);
					endx = Math.max(endx, j);
					endy = Math.max(endy, i);
					
				}
			}
		}

		for (int i = starty; i <= endy; i++) {
			for (int j = startx; j <= endx; j++) {
				if (arr[i][j] == '.') {
					System.out.println((i + 1) + " " + (j + 1));
					return;
				}
			}
		}

	}
}
