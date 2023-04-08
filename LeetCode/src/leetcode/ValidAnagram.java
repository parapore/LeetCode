package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {

		// ずるいやつｗ
//		char[] charArray1 = s.toCharArray();
//		char[] charArray2 = t.toCharArray();
//		
//		Arrays.sort(charArray1);
//		Arrays.sort(charArray2);
//		
//		return Arrays.equals(charArray1, charArray2);
		
		// 文字数が違う場合はfalse
		if (s.length() != t.length()) {
			return false;
		}
		
		
		
		// TreeMapバージョンも書きたい
		// Javaの各コレクションの特徴を調べておきたい

		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();

		// 文字をKey　数をValueとしてMapに格納
		for (int i = 0; i < s.length(); i++) {
			char char1 = s.charAt(i);

			// 既にカウント済みの文字ならスキップ
			if (map.containsKey(char1)) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (char1 == s.charAt(j)) {
					count++;
				}
			}
			map.put(char1, count);
		}

		// 同上
		for (int i = 0; i < t.length(); i++) {
			char char1 = t.charAt(i);

			// 既にカウント済みの文字ならスキップ
			if (map2.containsKey(char1)) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < t.length(); j++) {
				if (char1 == t.charAt(j)) {
					count++;
				}
			}
			map2.put(char1, count);
		}

		// アナグラム判定
//		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//			int count = 0;
//			int index = 1;
//			for (Map.Entry<Character, Integer> entry2 : map2.entrySet()) {
//
//				// 同じ単語
//				if (entry.getKey().equals(entry2.getKey())) {
//					count++;
//					// 同じ単語で違う個数
//					if (entry.getValue().equals(entry2.getValue()) == false) {
//						return false;
//					}
//				}
//
//				// 同じ単語が１個もない場合
//				if (count == 0 && index >= map2.size()) {
//					return false;
//				}
//				++index;
//			}
//		}
		
		// アナグラム判定
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			// 同じ単語
			if(map2.containsKey(entry.getKey())) {
				
				// 同じ単語で違う個数
				if(entry.getValue().equals(map2.get(entry.getKey())) == false) {
					return false;
				}
				
			// 同じ単語が1個もない
			} else {
				return false;
			}
		}
		return true;
	}

}