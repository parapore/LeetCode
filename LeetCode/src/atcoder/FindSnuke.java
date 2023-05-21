package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindSnuke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		String[][] arr = new String[h][w];
		List<int[]> answer = new ArrayList<>();

		for (int i = 0; i < h; i++) {
			arr[i] = sc.next().split("");
		}

		int[] dx = { 1, 0, -1, 0, 1, 1, -1, -1 };
		int[] dy = { 0, 1, 0, -1, 1, -1, 1, -1 };

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (arr[i][j].equals("s")) {//sからスタート
					
					// ８方向
					for(int k = 0; k < 8; k++) {
						
						String s = "";
						// ５文字分
						for(int l = 0; l < 5; l++) {
							int y = i + l*dy[k];
							int x = j + l*dx[k];
							
							if(y < 0 || y >= h || x < 0 || x >= w) {
								break;
							}
							s += arr[y][x];
						}
						if(s.equals("snuke")) {
							
							for(int l = 0; l < 5; l++) {
								int y = i + l*dy[k];
								int x = j + l*dx[k];
								
								System.out.println((y+1) + " " + (x+1));
							}
						}
					}

				}
			}
		}

		// 旧回答：８方向for文を書く力技
		//		for (int i = 0; i < h; i++) {
		//			for (int j = 0; j < w; j++) {
		//				if(arr[i][j].equals("s")) {
		//					// ８方向for文
		//					
		//					//右
		//					String s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i+k >= h) {
		//							break;
		//						}
		//						s += arr[i+k][j];
		//						int[] aa = {i+k, j};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//左
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i-k < 0) {
		//							break;
		//						}
		//						s += arr[i-k][j];
		//						int[] aa = {i-k, j};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//上
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(j+k >= w) {
		//							break;
		//						}
		//						s += arr[i][j+k];
		//						int[] aa = {i, j+k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//下
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(j-k < 0) {
		//							break;
		//						}
		//						s += arr[i][j-k];
		//						int[] aa = {i, j-k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//右上
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i+k >= h || j+k >= w) {
		//							break;
		//						}
		//						s += arr[i+k][j+k];
		//						int[] aa = {i+k, j+k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//左上
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i-k < 0 || j+k >= w) {
		//							break;
		//						}
		//						s += arr[i-k][j+k];
		//						int[] aa = {i-k, j+k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//右下
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i+k >= h || j-k < 0) {
		//							break;
		//						}
		//						s += arr[i+k][j-k];
		//						int[] aa = {i+k, j-k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//					//左下
		//					s = "";
		//					answer.clear();
		//					for (int k = 0; k < 5; k++) {
		//						if(i-k < 0 || j-k < 0) {
		//							break;
		//						}
		//						s += arr[i-k][j-k];
		//						int[] aa = {i-k, j-k};
		//						answer.add(aa);
		//					}
		//					//答え出力
		//					if(s.equals("snuke")) {
		//						for(int[] bb : answer) {
		//							System.out.println((bb[0]+1) +" "+ (bb[1]+1));
		//						}
		//						return;
		//					}
		//					
		//				}
		//			}
		//			
		//		}

	}
}