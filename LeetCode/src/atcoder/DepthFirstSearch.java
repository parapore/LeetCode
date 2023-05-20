package atcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepthFirstSearch {

		//再帰関数
		private void dfs(List<List<Integer>> graph, List<Boolean> seen, int vertexNumber) {
			
			// 訪れた頂点を探索済みとする
			seen.set(vertexNumber, true);
			
			// 深さ優先で探索する
			for (int i = 0; i < graph.get(vertexNumber).size(); i++) {//辺の数分繰り返す
				//行き先
				int destination = graph.get(vertexNumber).get(i);
				
				if (seen.get(destination)) {
					// 探索済みならスキップ
					continue;
				}
				dfs(graph, seen, destination);// 再帰。次の行き先を渡す。
			}
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();//頂点数


			// グラフ
			List<List<Integer>> graph = new ArrayList<>();
			// 探索済み判定用
			List<Boolean> seen = new ArrayList<>();

			//グラフを入力から受け取る
			for (int i = 0; i < n; i++) {//頂点数分繰り返す
				int m = sc.nextInt();//辺の数
				// 頂点
				List<Integer> vertex = new ArrayList<>();
				for (int j = 0; j < m; j++) {//辺の数分繰り返す

					vertex.add(sc.nextInt());//繋がっているノードを受け取る

				}
				// 頂点の数だけ探索判定用リストも作る
				seen.add(false);
				//頂点と辺をグラフに格納
				graph.add(vertex);
			}
			
			DepthFirstSearch d = new DepthFirstSearch();
			d.dfs(graph, seen, 0);


			System.out.println(graph);//[[5], [3, 6], [5, 7], [0, 7], [1, 2, 6], [], [7], [0]]
			System.out.println(seen);//[true, true, true, true, true, true, true, true]
		}

	}
