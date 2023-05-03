package atcoder;

import java.util.Scanner;

public class Traveling3 {

	//模範解答
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[110000];
		int[] x = new int[110000];
		int[] y = new int[110000];
		
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		
		for (int i = 0; i < n; i++) {
			t[i+1] = sc.nextInt();
			x[i+1] = sc.nextInt();
			y[i+1] = sc.nextInt();
		}
		
		boolean b = true;
		for (int i = 0; i < n; i++) {
			int dt = t[i+1] - t[i];
			int dist = Math.abs(x[i+1] - x[i]) + Math.abs(y[i+1] - y[i]);
			if(dt < dist) {
				 System.out.println("No");
				 return;

			}
			if(dist % 2 != dt % 2) {
				 System.out.println("No");
				 return;
			}

		}
		System.out.println("Yes");
	}

}
