package algosiki;

import java.util.Scanner;

public class Ruisekiwa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrAdd = new int[n];
		
		int add = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			add += arr[i];
			arrAdd[i] = add;
		}
		
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int k = sc.nextInt();
			if(k == 0) {
				System.out.println(0);
			} else {
				System.out.println(arrAdd[k-1]);
			}
			
			
		}

	}

}
