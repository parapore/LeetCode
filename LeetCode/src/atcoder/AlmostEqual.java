package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlmostEqual {
	private static int n;
	private static int m;
	private static boolean answer = false;
	private static boolean[] seen;
	private static List<char[]> charList = new ArrayList<>();
	private static List<char[]> surveyTarget = new ArrayList<>();
	
	private static void recursion() {
		if(answer) {
			return;
		}
		// ベース条件（再帰を終了する条件）
		// 配列数がNと同じなら比較処理に飛ぶ
		if(surveyTarget.size() == n) {
			// 比較処理にとんでTRUEなら終了。FALSEなら処理継続
			if(compareCharList()) {
				answer = true;
				return;
			}
		}
		
		// 未探索なら配列に加える
		for(int i = 0; i < n; i++) {
			if(seen[i] == false) {
				surveyTarget.add(charList.get(i));
				seen[i] = true;
				recursion();//再帰
				surveyTarget.remove(surveyTarget.size()-1);
				seen[i] = false;
			}
		}
	}
	
	// 文字列同士の比較。
	// 隣り合う文字列同士が全て一文字違いならTRUE
	private static boolean compareCharList() {
		
		boolean result = true;
		for(int i = 0; i < n-1; i++) {
			char[] c1 = surveyTarget.get(i);
			char[] c2 = surveyTarget.get(i+1);
			
			int count = 0;
			for (int j = 0; j < m; j++) {
				if(c1[j] != c2[j]) {
					count++;
				}
			}
			if(count != 1) {
				result = false;
				return result;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		seen = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			char[] c = sc.next().toCharArray();
			charList.add(c);
		}
		
		//再帰処理開始
		recursion();
		
		if(answer) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
//　旧回答。バケット法ではダメだった。いけそうな気もするんだけど。
//		List<int[]> list = new ArrayList<>();
//		List<char[]> charList = new ArrayList<>();
//
//		for (int i = 0; i < n; i++) {
//			char[] arr2 = sc.next().toCharArray();
//			charList.add(arr2);
//
//			int[] arr = new int[26];
//
//			for (char c : arr2) {
//				arr[(int) (c - 'a')]++;
//			}
//
//			list.add(arr);
//		}
//
//		// 2つだけ違えばOK。２重で全探索
//		int count = 0;
//		for (int i = 0; i < list.size(); i++) {
//			int[] arr3 = list.get(i);
//			for (int j = i + 1; j < list.size(); j++) {
//				int[] arr4 = list.get(j);
//
//				int sai = 0;
//				for (int k = 0; k < 26; k++) {
//					sai = sai + Math.abs(arr3[k] - arr4[k]);
//				}
//				if (sai == 2) {
//					count++;
//				}
//			}
//		}
//		if (count >= n-1) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

	}
}
