package atcoder;

import java.util.Scanner;

public class ShiftOnly {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		boolean b = true;
		int countSoto = 0;
		while (b) {
			int countUti = 0;
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i] % 2 == 0) {
					countUti++;
					b = true;
				} else {
					b = false;
					break;
				}
				
				 arr[i] = arr[i] / 2;
				
				if(countUti == n) {
					countSoto++;
				}
			}
		}
		System.out.println(countSoto);
		
	}

}
