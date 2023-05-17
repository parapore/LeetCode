package atcoder;

import java.util.Scanner;

public class ManyOranges {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt()*1000;

		int max = -1;
		int min = Integer.MAX_VALUE;
		
		for(int i = 1; i <= 1000000; i++) {
			if(a * i <= w && w <= b * i) {
				max = Math.max(max, i);
				min = Math.min(min, i);
			}
		}
		
		if(max == -1) {
			System.out.println("UNSATISFIABLE");
			
		} else {
			System.out.println(min + " "+ max);
		}

	}

}
