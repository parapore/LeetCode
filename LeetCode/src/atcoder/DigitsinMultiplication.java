package atcoder;

import java.util.Scanner;

public class DigitsinMultiplication {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		double sqrt = Math.sqrt(n);

		//平方根が整数ならそのまま答え
		int count = 1;
		if (sqrt % 1 == 0) {
			while (sqrt / 10 >= 1) {
				sqrt /= 10;
				count++;
			}
			System.out.println(count);
			return;
		}

		int answer = 99999999;

		for (long i = 1; i * i <= n; i++) {

			if (n % i != 0) {
				continue;
			}
				long c = Math.max(n / i, i);

				int count2 = 1;
				while (c / 10 >= 1) {
					c /= 10;
					count2++;
				}
				answer = Math.min(answer, count2);
			

		}
		System.out.println(answer);
	}

}
