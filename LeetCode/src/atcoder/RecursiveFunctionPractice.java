package atcoder;

import java.util.ArrayList;
import java.util.List;

//多重for文を再帰で作る練習
public class RecursiveFunctionPractice {
	private static List<Integer> list = new ArrayList<>();
	private static boolean[] seen = new boolean[3];
	
	// 2重for文。2桁の数列を全通り作る
	private static void recursion() {
		//ベース条件（終了条件）
		// 2桁になったら終了
		if(list.size() == 2) {
			for(int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < 2; i++) {
			list.add(i);
			recursion();
			list.remove(list.size()-1);// 末尾を削除。ここがポイント
		}
		
	}
	
	// 3重for文。順列の並び替え全通りやる。3の階乗通りになる。
	private static void rotate() {
		//ベース条件（終了条件）
		// 3桁になったら終了
		if(list.size() == 3) {
			for(int num : list) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < 3; i++) {
			if(seen[i] == false) {
				list.add(i+1);
				seen[i] = true;
				rotate();
				list.remove(list.size()-1);// 末尾を削除。ここがポイント
				seen[i] = false;
			}

		}
		
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		recursion();
		rotate();
	}

}
