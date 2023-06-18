package atcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Mapで集計してからMapのValueでソートする問題がちょくちょく出る。
public class Centers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n * 3];

		// 2回目出現時点で答えを出力。ソートしない。一番シンプル。AC
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < 3 * n; i++) {
			a[i] = sc.nextInt() - 1;

			if (map.containsKey(a[i])) {

				if (map.get(a[i]) == 1) {
					map.put(a[i], map.get(a[i]) + 1);
					System.out.print(a[i] + 1 + " ");
				}

			} else {
				map.put(a[i], 1);
			}
		}

		//		 Listに追加バージョン。やってることは上と同じ。AC。
		//				Map<Integer, Integer> map = new HashMap<>();
		//				List<Integer> list = new ArrayList<>(n);
		//		
		//				for (int i = 0; i < 3 * n; i++) {
		//					a[i] = sc.nextInt() - 1;
		//		
		//					if (map.containsKey(a[i])) {
		//		
		//						if (map.get(a[i]) == 1) {
		//							map.put(a[i], map.get(a[i]) + 1);
		//							list.add(a[i]);
		//						}
		//		
		//					} else {
		//						map.put(a[i], 1);
		//					}
		//				}
		//		
		//				for (int ans : list) {
		//					System.out.print(ans + 1 + " ");
		//				}

		//　Map→２次元配列→２次元配列をソート。AC。これは汎用性高そう。
		//		Map<Integer, Integer> map = new HashMap<>();
		//		int[][] soeji = new int[n][2];// [n]{出現数字, 出現箇所}
		// 
		//		for (int i = 0; i < 3 * n; i++) {
		//			a[i] = sc.nextInt() - 1;
		// 
		//			if (map.containsKey(a[i])) {
		// 
		//				if (map.get(a[i]) == 1) {
		//					map.put(a[i], map.get(a[i])+1);
		//					soeji[a[i]][0] = a[i];
		//					soeji[a[i]][1] = i;
		//				}
		// 
		//			} else {
		//				map.put(a[i], 1);
		//			}
		//		}
		//		 		 ２個めの要素でソート
		//		Arrays.sort(soeji, (aa, bb) -> aa[1] - bb[1]);
		// 
		//		for (int i = 0; i < soeji.length; i++) {
		//			System.out.print(soeji[i][0] + 1 + " ");
		//		}

		// HashMap→TreeMapでソートする。ACだがごちゃごちゃ。
		//		Map<Integer, int[]> map = new HashMap<>();
		//		Map<Integer, Integer> tree = new TreeMap<>();//添字、値
		//		for (int i = 0; i < 3 * n; i++) {
		//			a[i] = sc.nextInt() - 1;
		//
		//			if (map.containsKey(a[i])) {
		//
		//				if (map.get(a[i])[0] == 1) {
		//					int[] b = new int[2];//出現回数、添字番号
		//					b[0] = 2;
		//					b[1] = i;
		//					map.put(a[i], b);
		//				}
		//
		//			} else {
		//				int[] b = new int[2];//出現回数、添字番号
		//				b[0] = 1;
		//				b[1] = i;
		//
		//				map.put(a[i], b);
		//			}
		//		}
		//
		//		// TreeMapでソートする
		//		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {
		//			int key = entry.getKey() + 1;//値
		//			int val = entry.getValue()[1];//添字番号
		//
		//			tree.put(val, key);
		//		}
		//
		//		for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
		//
		//			System.out.print(entry.getValue() + " ");
		//		}
	}
}