package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//アナグラムグループ毎に仕分けするプログラム
//Time exceded
public class GroupAnagramas {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> finalAnswer = new ArrayList<>();
		Map<char[], String> map = new HashMap<>();
		Map<char[], String> map2 = new HashMap<>();//map2は比較済みを格納する

		//String配列をMapに格納
		for (int i = 0; i < strs.length; i++) {
			map.put(strs[i].toCharArray(), strs[i]);
		}

		// アナグラム判定
		for (Map.Entry<char[], String> entry : map.entrySet()) {
			List<String> group = new ArrayList<>();
			char[] tempChar = null;
			char[] tempChar2 = null;
			for (Map.Entry<char[], String> entry2 : map.entrySet()) {

				//比較対象のcharをソート
				tempChar = entry.getKey();
				tempChar2 = entry2.getKey();
				Arrays.sort(tempChar);
				Arrays.sort(tempChar2);

				//ソート後のCharが同じ
				//かつ　元の単語が同じものではない(同じ要素ではない）

				if (Arrays.equals(tempChar, tempChar2)
						&& entry.getValue() == entry2.getValue() == false) { //ここを＝＝にすれば重複ありも判定可能になりそう

					//　比較済みMapに存在するか判定
					boolean isExistMap = false;
					for (Map.Entry<char[], String> entry3 : map2.entrySet()) {
						if (Arrays.equals(entry3.getKey(), tempChar2)) {
							isExistMap = true;
						}
					}

					if (isExistMap == false) {
						group.add(entry2.getValue());
					}
				}
			}

			// 最初containsKey(tempChar)にしてたけど配列の中身比較はできない
			// ループ文で比較するしかないか
			//　比較済みMapに存在するか判定
			boolean isExistMap2 = false;
			for (Map.Entry<char[], String> entry4 : map2.entrySet()) {
				if (Arrays.equals(entry4.getKey(), tempChar)) {
					isExistMap2 = true;
				}
			}

			//比較済みの中に存在しない場合
			if (isExistMap2 == false) {
				//比較対象1をここで格納
				group.add(entry.getValue());

			}

			//比較済みとして格納
			map2.put(tempChar, entry.getValue());

			if (group.size() > 0) {
				finalAnswer.add(group);
			}

		}
		return finalAnswer;
	}

	// 素直なバージョン
	// Wrong
	public List<List<String>> groupAnagrams2(String[] strs) {
		List<List<String>> finalAnswer = new ArrayList<>();
		Map<String, char[]> map = new HashMap<>();
		Map<String, char[]> map2 = new HashMap<>();//map2は比較済みを格納する

		//String配列をMapに格納
		for (int i = 0; i < strs.length; i++) {
			char[] tempChar = strs[i].toCharArray(); // 重複避けのためにChar配列にする。苦肉の策。
			char[] tempChar2 = strs[i].toCharArray();
			Arrays.sort(tempChar2);
			map.put(strs[i], tempChar);
		}

		// アナグラム判定
		for (Map.Entry<String, char[]> entry : map.entrySet()) {
			List<String> group = new ArrayList<>();

			// Map2に存在するなら比較済みのためスキップ
			if (map2.containsKey(new String(entry.getKey()))) {
				continue;
			}

			for (Map.Entry<String, char[]> entry2 : map.entrySet()) {
				

				//ソート後のCharが同じ
				//かつ　同じ要素ではない(同じアドレスではない）
				if (Arrays.equals(entry.getValue(), entry2.getValue())
						&& entry.getValue() == entry2.getValue() == false) { //ここを＝＝にすれば重複ありも判定可能になりそう

					//比較対象２だけ格納
					group.add(entry2.getKey());
					// 比較済みとして格納
					map2.put(entry2.getKey(), entry2.getValue());
				}
			}
			// 重複しないようにここで比較対象１を格納
			group.add(entry.getKey());
			//比較済みとして格納
			map2.put(entry.getKey(), entry.getValue());

			if (group.size() > 0) {
				finalAnswer.add(group);
			}

		}
		return finalAnswer;
	}
	
	// HashMapに格納しつつアナグラム判定もするバージョン
	// Accepted!
	public List<List<String>> groupAnagrams3(String[] strs) {
		List<List<String>> finalAnswer = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		//String配列をソートしてMapのKeyに
		// Valueには同じアナグラムグループを入れる
		for (int i = 0; i < strs.length; i++) {
			
			/** ソートしてからわざわざStringに戻しているのは
			 * containsKeyで存在判定をしたいから
			 * char配列だと配列の中の要素が全て同じでもcontainsKeyではイコール判定されないため
			 * Stringに戻している。
			 *  **/
			char[] tempChar = strs[i].toCharArray();
			Arrays.sort(tempChar);
			String afterSort = new String(tempChar);
			
			List<String> list = new ArrayList<>();
			
			/** 既にMapに存在する場合はValueだけ更新　
			 * Valueにはソート前のStringを入れる。同じアナグラムグループとして。
			 * **/
			if(map.containsKey(afterSort)) {
				list = map.get(afterSort);
				list.add(strs[i]);
				map.put(afterSort, list);
				
			} else {
			// 存在しない場合はそのままMapに追加
				list.add(strs[i]);
				map.put(afterSort, list);
			}
		}
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			finalAnswer.add(entry.getValue());
		}
		return finalAnswer;
	}
}
