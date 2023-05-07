package atcoder;

import java.util.Scanner;

// すぬけ君の塗り絵２イージー　ABC047
public class SunukeNurieEasy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[h][w];
		
		
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a = sc.nextInt();
			
			if(a == 1) {
				//aより小さいxを塗りつぶし
				for(int j = 0; j < x; j++) {//x座標
					for(int k = 0; k < h; k++) {//y座標
						arr[k][j] = 1;
					}
				}
			}
			//aより大きいxを塗りつぶし
			if(a == 2) {
				//aより大きいxを塗りつぶし
				for(int j = w-1; j > x-1; j--) {//x座標
					for(int k = 0; k < h; k++) {//y座標
						arr[k][j] = 1;
					}
				}
			}
			
			// aより小さいYを塗りつぶし
			if(a == 3) {
				for(int j = 0; j < y; j++) {//ｙ座標
					for(int k = 0; k < w; k++) {//x座標
						arr[j][k] = 1;
					}
				}
			}
			
			// aより大きいYを塗りつぶし
			if(a == 4) {
				for(int j = h-1; j > y-1; j--) {//ｙ座標
					for(int k = 0; k < w; k++) {//x座標
						arr[j][k] = 1;
					}
				}
			}
		}
		
		int answer = 0;
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++) {
				if(arr[i][j] == 0) {
					answer++;
				}
			}
		}
		System.out.println(answer);
	}
}
