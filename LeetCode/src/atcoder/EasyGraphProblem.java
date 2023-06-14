package atcoder;
import java.util.Scanner;

public class EasyGraphProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] count = new int[n];
		
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			
			count[Math.max(a, b)]++;
		}
		
		int ans = 0;
		for(int num : count) {
			if(num == 1) {
				ans++;
			}
		}
		System.out.println(ans);
		
		// TLE解答
//		List<List<Integer>> graph = new ArrayList<>();//グラフ
//		
//		
//		// グラフの中身初期化。他に良い方法ないものか
//		for (int i = 0; i < n; i++) {
//			List<Integer> list = new ArrayList<>(n);
//			graph.add(list);
//		}
//
//		for (int i = 0; i < m; i++) {
//			int a = sc.nextInt() - 1;
//			int b = sc.nextInt() - 1;
//
//			List<Integer> vertex = graph.get(a);//頂点
//			vertex.add(b);//繋がる頂点
//			graph.add(vertex);
//
//			List<Integer> vertex2 = graph.get(b);
//			vertex2.add(a);//双方向
//			graph.add(vertex2);
//		}
//
//		int ans = 0;
//		for (int i = 0; i < n; i++) {
//			List<Integer> vertex = graph.get(i);
//			int count = 0;
//			for (int num : vertex) {
//				if (i > num) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				ans++;
//			}
//		}
//		System.out.println(ans);
	}
}
