package atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CardsQueryProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		Map<Integer, List<Integer>> hakoKey = new HashMap<>();
		Map<Integer, Set<Integer>> cardKey = new HashMap<>();

		for (int i = 0; i < q; i++) {
			int query = sc.nextInt();

			if (query == 1) {

				int card = sc.nextInt();
				int hako = sc.nextInt();

				if (hakoKey.containsKey(hako)) {
					List<Integer> list = hakoKey.get(hako);
					list.add(card);
					hakoKey.put(hako, list);

				} else {
					List<Integer> list2 = new ArrayList<>();
					list2.add(card);
					hakoKey.put(hako, list2);

				}

				if (cardKey.containsKey(card)) {
					Set<Integer> hakoValue = cardKey.get(card);
					hakoValue.add(hako);//重複なら上書き
					cardKey.put(card, hakoValue);

				} else {
					Set<Integer> hakoValue = new HashSet<>();
					hakoValue.add(hako);
					cardKey.put(card, hakoValue);

				}

			} else if (query == 2) {

				//昇順で箱の中身
				List<Integer> ansList = hakoKey.get(sc.nextInt());
				Collections.sort(ansList);
				for (int ans : ansList) {
					System.out.print(ans + " ");
				}
				System.out.println();
			} else {

				Set<Integer> ansSet = cardKey.get(sc.nextInt());

				int[] ansArr = new int[ansSet.size()];
				int count = 0;
				for(int num : ansSet) {
					
					ansArr[count++] = num;
				}
				Arrays.sort(ansArr);

				for (int ans : ansArr) {
					System.out.print(ans + " ");
				}
				System.out.println();
			}
			
		}

	}
}

