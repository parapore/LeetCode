package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 座標移動問題。TLEだった。
public class Traveling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<int[]> list = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int[] arr = new int[3];
			if(i == 0) {
				arr[0] = sc.nextInt();
				arr[1] = sc.nextInt();
				arr[2] = sc.nextInt();
			} else {
				int[] before = list.get(i -1);
				arr[0] = sc.nextInt() - before[0];
				arr[1] = sc.nextInt() - before[1];
				arr[2] = sc.nextInt() - before[2];
			}

			list.add(arr);
		}
		
		int count = 0;
		
		for(int[] arr2 : list) {
			boolean b = false;
			
			for(int i = 0; i <= arr2[0] ; i++) {
				if(b) {
					break;
				}
				for(int j = 0; j <= arr2[0] -i; j++) {
					if(b) {
						break;
					}
					// プラスとマイナスの動き
					if(i + j*-1 == arr2[1]) {
						
						// 残り秒数分ｙ座標の探索
						for(int k = 0; k <= arr2[0] -i -j ; k++) {
							if(b) {
								break;
							}
							for(int l = 0; l <= arr2[0] -i -j -k; l++) {
								if(k + l*-1 == arr2[2] && i + j + k + l == arr2[0]) {
									count++;
									b = true;
									i=0;
									j=0;
									k=0;
									l=0;
									break;
								}
							}
						}

					}
				}
			}
		}
		if(count == list.size()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
