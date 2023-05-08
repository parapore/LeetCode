package atcoder;

import java.util.Scanner;

public class TakahashisInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] c = new int[9];
		
		int max = 0;
		for(int i = 0; i < 9; i++) {
			c[i] = sc.nextInt();
		}
		
		for(int a1 = 0; a1 <= 100; a1++) {
			for(int a2 = 0; a2 <= 100; a2++) {
				for(int a3 = 0; a3 <= 100; a3++) {
					int b11 = c[0] - a1;
					int b12 = c[1] - a1;
					int b13 = c[2] - a1;
					int b21 = c[3] - a2;
					int b22 = c[4] - a2;
					int b23 = c[5] - a2;
					int b31 = c[6] - a3;
					int b32 = c[7] - a3;
					int b33 = c[8] - a3;
					
					if(b11 < 0 || b12 <0 || b13 <0 || b21 <0 || b22 <0 || b23 <0 || b31 <0 || b32 <0 || b33 <0) {
						continue;
					}
					
					if(b11 == b21 && b21 == b31
						&& b12 == b22 && b22 == b32
						&& b13 == b23 && b23 == b33) {
						
						System.out.println("Yes");
						return;
					}
				}
			}
		}
		System.out.println("No");
		
	}

}
