package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class Kagamimochi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int count = 0;
		for(int i = n -2; i >= 0; i--) {
			if(arr[i] < arr[i +1]) {
				count++;
			}
		}
		System.out.println(count+1);
	}

}
