package algosiki;

import java.util.Scanner;

public class AllSearchString5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		long answer = 0;
		long[] addArr = new long[n];
		long addAll = 0;
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			addAll += arr[i];
		}
		
		for(int i = 0; i < n; i++) {
			addAll -= arr[i];
			addArr[i] = addAll;
		}
		
		
		for(int i = 0; i < n; i++) {
			// arr[i]*(arr[0] + arr[1] arr[2]...arr[n-1])の分配法則
			answer += arr[i] * addArr[i];
		}
		
//		for(int i = 0; i < n; i++) {
//			for(int j = i + 1; j < n; j++) {
//				answer += arr[i] * arr[j];
//			}
//		}
		System.out.println(answer);
	}
}
