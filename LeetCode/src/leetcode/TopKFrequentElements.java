package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// int配列の中から出現数が最も多い要素をk個取り出す問題
public class TopKFrequentElements {

	/** 自分の解答 Accepted!
	 * Map<数値, 出現数>に一旦格納してから
	 * Map<出現数, 数値リスト>に格納し直す
	 * 出現数でソートして高出現数順にcontainsKey(出現数)で取り出す。
	 *  **/
	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();//Map<数値, 出現数>
		Map<Integer, List<Integer>> map2 = new HashMap<>();// Map<出現数, 数値リスト>

		for (int num : nums) {
			// 存在判定
			if (map.containsKey(num)) {
				//既に存在すれば出現数に+1
				map.put(num, map.get(num) + 1);
			} else {
				//なければ新規追加
				map.put(num, 1);
			}
		}

		// 出現数⇔数値を入れ替え
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			List<Integer> list = new ArrayList<>();

			if (map2.containsKey(entry.getValue())) {

				// 出現回数が同じなら同じ要素に入れる
				list = map2.get(entry.getValue());
				list.add(entry.getKey());
				map2.put(entry.getValue(), list);
			} else {

				// 出現回数が違うものは新規追加
				list.add(entry.getKey());
				map2.put(entry.getValue(), list);
			}
		}

		/** 出現数でソートして上位K個分を抽出 **/
		// 出現数をint配列に格納
		int count = 0;
		int[] sort = new int[map2.size()];
		for (Map.Entry<Integer, List<Integer>> entry : map2.entrySet()) {
			sort[count] = entry.getKey();
			count++;
		}

		Arrays.sort(sort);

		// 出現数順にk個取り出す
		int count2 = 0;
		int[] answer = new int[k];
		for (int i = 0; i < sort.length; i++) {
			// 後ろから順（高頻度順に取り出す）
			List<Integer> list2 = map2.get(sort[sort.length - 1 - i]);

			//リストから答え（数値）を取り出す
			for (int num2 : list2) {
				if (count2 >= answer.length) {
					break;
				}
				answer[count2] = num2;
				count2++;
			}
		}
		return answer;
	}

	public int[] topKFrequent2(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();//Map<数値, 出現数>
		int[] answer = new int[k];
	
		int max = 1;
		for (int num : nums) {
			// 存在判定
			if (map.containsKey(num)) {
				//既に存在すれば出現数に+1
				int appearTime = map.get(num) + 1;
				map.put(num, appearTime);
				if(max < appearTime) {
					max = appearTime;
				}
			} else {
				//なければ新規追加
				map.put(num, 1);
			}
		}
		List<List<Integer>> list = Stream.generate(() -> new ArrayList<Integer>())
                .limit(max)
                .collect(Collectors.toList());

		// 添字番号＝出現回数でListに数値を格納
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			list.get(entry.getValue()-1).add(entry.getKey());
		}
		
		int count2 = 0;
		for(int i = 0; i < nums.length; i++) {
			List<Integer> list2 = list.get(list.size()-1 -i);
			if(list2 == null) {
				continue;
			}
			for(int ans : list2) {
				answer[count2] = ans;
				count2++;
				
				if(count2 >= k) {
					return answer;
				}
			}

		}
		return null;
	}
}
