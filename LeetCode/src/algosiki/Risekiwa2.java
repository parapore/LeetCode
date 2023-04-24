package algosiki;

import java.util.Scanner;

public class Risekiwa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arrAdd = new int[n];
		int add = 0;
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			add += arr[i];
			arrAdd[i] = add;
		}
		
		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			
			if(l == 0) {
				System.out.println(arrAdd[r-1]);
			} else {
				System.out.println(arrAdd[r-1] - arrAdd[l-1]);
			}
		}

	}

}
