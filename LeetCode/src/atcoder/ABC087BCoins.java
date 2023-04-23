package atcoder;

import java.util.Scanner;

public class ABC087BCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int o = sc.nextInt();
		int p = sc.nextInt();

//		List<int[]> list = new ArrayList<>();
//
//		int total = 0;
//		int count = 0;
//		int count500 = 0;
//		int count100 = 0;
//		int count50 = 0;
//
//		for (int i = 0; i < m + 1; i++) {
//
//			if (i < m) {
//				total += 500;
//				count500++;
//			} else {
//				total += 0;
//			}
//
//			if (total == p) {
//				total = 0;
//				int[] arr = new int[3];
//				arr[0] = count500;
//				arr[1] = count100;
//				arr[2] = count50;
//				list.add(arr);
//				count500 = 0;
//				count100 = 0;
//				count50 = 0;
//				count++;
//				continue;
//			} else if (total > p) {
//				total = 0;
//				count500 = 0;
//				count100 = 0;
//				count50 = 0;
//				continue;
//			}
//
//			for (int j = 0; j < n + 1; j++) {
//				if (j < n) {
//					total += 100;
//					count100++;
//				} else {
//					total += 0;
//				}
//
//				if (total == p) {
//					total = 0;
//					int[] arr = new int[3];
//					arr[0] = count500;
//					arr[1] = count100;
//					arr[2] = count50;
//					list.add(arr);
//					count500 = 0;
//					count100 = 0;
//					count50 = 0;
//					count++;
//					continue;
//				} else if (total > p) {
//					total = 0;
//					count500 = 0;
//					count100 = 0;
//					count50 = 0;
//					continue;
//				}
//
//				for (int k = 0; k < o + 1; k++) {
//					if (k < o) {
//						total += 50;
//						count50++;
//					} else {
//						total += 0;
//					}
//
//					if (total == p) {
//						total = 0;
//						int[] arr = new int[3];
//						arr[0] = count500;
//						arr[1] = count100;
//						arr[2] = count50;
//						list.add(arr);
//						count500 = 0;
//						count100 = 0;
//						count50 = 0;
//						count++;
//						continue;
//					} else if (total > p) {
//						total = 0;
//						count500 = 0;
//						count100 = 0;
//						count50 = 0;
//						continue;
//					}
//				}
//			}
//		}
//		for (int i = 0; i < list.size() - 1; i++) {
//			int[] arr2 = list.get(i);
//			int[] arr3 = list.get(i + 1);
//			boolean sameAll = true;
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr2.length != arr3.length) {
//					sameAll = false;
//					break;
//				}
//
//				if (arr2[j] != arr3[j]) {
//					sameAll = false;
//					break;
//				}
//			}
//			if (sameAll) {
//				count--;
//			}
//		}
//		System.out.println(count);
		
		int count = 0;
		for(int i = 0; i <= m; i++) {
			for(int j = 0; j <= n; j++) {
				for(int k = 0; k <= o; k++) {
					if(500*i + 100*j + 50*k == p) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
