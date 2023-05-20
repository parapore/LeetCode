package atcoder;

import java.util.ArrayList;
import java.util.List;

public class DirectdGraph {

	//有向グラフを写経
	public static void main(String[] args) {
		// グラフ
		List<List<Integer>> graph = new ArrayList<>();
		
		// 頂点
		List<Integer> vertex = new ArrayList<>();
		
		
		vertex.add(5);//頂点0 数値は頂点０から向かう別の頂点。頂点０⇨頂点５
		graph.add(vertex);// 頂点０をグラフに格納
		
		vertex.add(3);//頂点1
		vertex.add(6);//頂点1
		graph.add(vertex);// 頂点１をグラフに格納
		
		
		vertex.add(5);//頂点2
		vertex.add(7);//頂点2
		graph.add(vertex);
		
		vertex.add(0);//頂点3
		vertex.add(7);//頂点3
		graph.add(vertex);
		
		vertex.add(1);//頂点4
		vertex.add(2);//頂点4
		vertex.add(6);//頂点4
		graph.add(vertex);
		
		graph.add(vertex);//頂点５から向かう頂点はない
		
		vertex.add(7);//頂点6
		graph.add(vertex);
		
		vertex.add(0);//頂点7
		graph.add(vertex);

	}
}
