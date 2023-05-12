package algosiki;

import java.util.Scanner;

public class FutagoSosuu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int count = 0;
		for(int i = 3; i+2 <= n; i++) {
			boolean b = true;
			for(int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					b = false;
					break;
				}
			}
			if(b) {
				// i + 2 が素数か？
				for(int k = 2; k * k <= i+2; k++) {
					if((i+2) % k == 0) {
						b = false;
						break;
					}
				}
				if(b) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
