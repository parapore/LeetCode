package algosiki;

import java.util.Scanner;

public class PrimeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int max = Math.min(3, n);
		

		for (int i = n; i > 3; i--) {
			boolean b = true;
			for(int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				max = Math.max(max, i);
				System.out.println(max);
				return;
			}
		}
		System.out.println(max);
	}

}
