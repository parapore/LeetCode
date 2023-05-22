package atcoder;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

// 深さ優先探索（スタックバージョン）
public class DepthFirstSearch3 {
	// Double Ended Queue(両端キュー）先入れ先出しと後入れ先出しのどちらにも対応
	private static Deque<Integer> deque = new ArrayDeque<>();
	private static List<List<Integer>> graph;
	private static List<Boolean> seen;

	private void dfs() {

		// スタックが空になるまで
		while (deque.isEmpty() == false) {
			//スタックからノードを取り出す。取り出すとスタックから削除される
			int vertexNumber = deque.pop();
			
			System.out.print(vertexNumber+ " ");//0 11 13 14 12 4 8 10 9 5 7 6 1 3 2

			// 訪れたノードを探索済みとする
			seen.set(vertexNumber, true);

			// 深さ優先で探索する
			for (int i = 0; i < graph.get(vertexNumber).size(); i++) {//繋がるノードの数分繰り返す
				//行き先
				int destination = graph.get(vertexNumber).get(i);

				if (seen.get(destination) == false) {
					// 未探索ノードをスタック
					deque.push(destination);
				}
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//ノード数

		// グラフ
		graph = new ArrayList<>();
		// 探索済み判定用
		seen = new ArrayList<>();

		//グラフを入力から受け取る
		for (int i = 0; i < n; i++) {//ノード数分繰り返す
			int m = sc.nextInt();//繋がるノードの数
			// ノード
			List<Integer> vertex = new ArrayList<>();
			for (int j = 0; j < m; j++) {//繋がるノードの数分繰り返す

				vertex.add(sc.nextInt());//繋がっているノードを受け取る

			}
			// ノードの数だけ探索判定用リストも作る
			seen.add(false);
			//ノード＆繋がるノードをグラフに格納
			graph.add(vertex);
		}

		DepthFirstSearch3 d = new DepthFirstSearch3();
		// スタート地点をスタック
		deque.push(0);
		d.dfs();

		System.out.println(seen);//[true, true, true, true, true, true, true, true, true, true, true, true, true, true, true]
	}

}
