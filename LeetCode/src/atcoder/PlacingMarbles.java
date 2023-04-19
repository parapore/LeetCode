package atcoder;

import java.util.Scanner;

public class PlacingMarbles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		String s = sc.next();
		
		
		int count = 0;
		for (int i = 0; i < 3; i++) {
			char c = s.charAt(i);
			if('1' == c) {
				count++;
			}
		}
		System.out.println(count);
	}
}
