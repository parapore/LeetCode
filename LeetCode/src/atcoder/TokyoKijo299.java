package atcoder;

import java.util.Scanner;

public class TokyoKijo299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] arr = s.toCharArray();

		int count = 0;
		int max = 0;
		boolean b = false;
		for (char c : arr) {
			if ('o' == c) {
				count++;
			} else if ('-' == c) {
				if (max < count) {
					max = count;
				}
				b = true;
				count = 0;
			}

		}
		if(b && max < count) {
			max = count;
		}
		
		if (max == 0) {
			System.out.println(-1);
		} else {
			System.out.println(max);
		}
	}

}
