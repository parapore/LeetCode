package atcoder;

import java.util.ArrayList;
import java.util.List;

public class DirectdGraph {

	//有向グラフを写経。隣接リスト表現
	public static void main(String[] args) {
		// グラフ
		List<List<Integer>> graph = new ArrayList<>();
		
		// 頂点
		List<Integer> vertex0 = new ArrayList<>();
		vertex0.add(5);//頂点0 数値は頂点０から向かう別の頂点。頂点０→頂点５に向かう辺を表す。
		graph.add(vertex0);// 頂点０と辺をグラフに格納
		
		List<Integer> vertex1 = new ArrayList<>();
		vertex1.add(3);//頂点1
		vertex1.add(6);//頂点1
		graph.add(vertex1);// 頂点１と辺をグラフに格納
		
		
		List<Integer> vertex2 = new ArrayList<>();
		vertex2.add(5);//頂点2
		vertex2.add(7);//頂点2
		graph.add(vertex2);
		
		List<Integer> vertex3 = new ArrayList<>();
		vertex3.add(0);//頂点3
		vertex3.add(7);//頂点3
		graph.add(vertex3);
		
		List<Integer> vertex4 = new ArrayList<>();
		vertex4.add(1);//頂点4
		vertex4.add(2);//頂点4
		vertex4.add(6);//頂点4
		graph.add(vertex4);
		
		List<Integer> vertex5 = new ArrayList<>();
		graph.add(vertex5);//頂点５から向かう頂点はない
		
		List<Integer> vertex6 = new ArrayList<>();
		vertex6.add(7);//頂点6
		graph.add(vertex6);
		
		List<Integer> vertex7 = new ArrayList<>();
		vertex7.add(0);//頂点7
		graph.add(vertex7);
		
		System.out.println(graph);//[[5], [3, 6], [5, 7], [0, 7], [1, 2, 6], [], [7], [0]]


	}
}
