package algosiki;

import java.io.IOException;
import java.util.Scanner;

public class LightsOut {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		char[][] s = new char[h][w];

		for (int i = 0; i < h; i++) {
			s[i] = sc.next().toCharArray();
		}

		char[][] temp = new char[h][w];

		int dy[] = {0, 0, 1, 0, -1 };
		int dx[] = {0, 1, 0, -1, 0 };

		for (int i = 0; i < (1 << (h * w)); i++) {

			//配列の初期化
			for (int l = 0; l < h; l++) {
				temp[l] = s[l].clone();
			}

			//どの要素を選択するか
			for (int j = 0; j < h * w; j++) {
				if ((i & (1 << j)) != 0) {

					for (int k = 0; k < 5; k++) {
						int hh = j / w;
						int ww = j % w;

						hh += dy[k];
						ww += dx[k];

						if (hh < 0 || hh >= h || ww < 0 || ww >= w) {
							continue;
						}

						if (temp[hh][ww] == '.') {
							temp[hh][ww] = '#';
						} else {
							temp[hh][ww] = '.';
						}

					}

				}

			}
			boolean b = true;
			for(int m = 0; m < h; m++) {
				for (int o = 0; o < w; o++) {
					if(temp[m][o] == '#') {
						b = false;
						break;
					}
					
				}
			}
			if(b) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
