package algosiki;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JunkaiSales_Donyokuhou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		boolean[] seen = new boolean[n];
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			
		}
		
		seen[0] = true;
		double sum = 0;
		double kyori = 0;
		for (int i = 0; i < n; i++) {
			double minKyori = Double.MAX_VALUE;
			
			for (int j = 0; j < n; j++) {
				
				kyori = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				
				
				if(minKyori == kyori && seen[j] == false) {
					list.add(j);
				}
				
				if(minKyori > kyori && seen[j] == false) {
					minKyori = kyori;
					list.clear();
					list.add(j);
				}
			}
			if(list.size() == 0) {
				//初期地点に戻る
				sum += Math.sqrt((x[i] - x[0]) * (x[i] - x[0]) + (y[i] - y[0]) * (y[i] - y[0]));
				System.out.println(sum);
				return;
			} else {
				// 移動する
				int destination = list.get(0);
				seen[destination] = true;
				i = destination-1;
				sum += minKyori;
				list.clear();
				
			}
		}
	}
}
