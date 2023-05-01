package atcoder;

import java.util.Arrays;
import java.util.Scanner;

public class CardGameforTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int alice = 0;
		int bob = 0;
		int count = 0;
		for(int i = n -1; i >= 0; i--) {
			if(count % 2 == 0) {
				alice += arr[i];
			} else {
				bob += arr[i];
			}
			count++;
		}
		
		System.out.println(alice - bob);
	}

}
