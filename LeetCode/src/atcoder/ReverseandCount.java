package atcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseandCount {

	//ARC160 途中までしか書けなかった。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] lr = new int[k];
		int[] arr = new int[n];
		List<Integer> list1 = new ArrayList<>();
		List<List<Integer>> listlist = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list1.add(sc.nextInt());
		}

		for (int i = 0; i < n * (n + 1) / 2; i++) {
			listlist.add(list1);
		}

		//f(L,R)を作る
		
		List<List<Integer>> listlist2 = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				List<Integer> list2 = new ArrayList<>();
				list2.add(i);
				list2.add(j);
				listlist2.add(list2);
			}
		}

		// 反転数列を作る
		for (int i = 0; i < listlist2.size(); i++) {
			int l = listlist2.get(i).get(0);
			int r = listlist2.get(i).get(1);
			List<Integer> motoList = listlist.get(i);

			// もとの数列を反転していれる
			for (int k1 = 0; k1 < Math.abs(l-r); k1++) {
				Collections.swap(motoList, l - 1 + k1, r - 1 - k1);
			}

			
		}
		System.out.println("");
	}

}
