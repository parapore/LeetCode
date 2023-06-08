package atcoder;

import java.util.Scanner;

public class Base8to9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int k = sc.nextInt();

		if (n.equals("0")) {
			System.out.println(0);
			return;
		}
		
		for (int i = 0; i < k; i++) {
			long num = Long.parseLong(n, 8);
			n = Long.toString(num, 9);
			n = n.replaceAll("8", "5");
			
		}
		System.out.println(n);
		
		
		//最初の解答。Math.pow の返り値がdouble型。16桁までなのでずれる。
//		String base8 = n;
//		String base9 = "";
//		String base10 = "";
//
//		for (int i = 0; i < k; i++) {
//			long long10 = 0;
//
//			//8進数→10進数
//			for (int j = base8.length(); j > 0; j--) {
//				String s8 = base8.substring(j - 1, j);
//
//				// Math.pow の返り値がdouble型。16桁までなのでずれる。
//				long10 += Long.parseLong(s8) * Math.pow(8, base8.length() - j);
//
//			}
//
//			base9 = "";
//			while (long10 > 0) {
//				base9 = long10 % 9 + base9;
//				long10 /= 9;
//			}
//
//			base8 = base9.replaceAll("8", "5");//8進数扱い
//		}
//		
//		System.out.println(base8);
	}
}
