package atcoder;

import java.util.Scanner;

// 文字列チェック　後ろから判定するのがポイント。
public class Hakutyuumu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if (s.length() <= 4) {
			System.out.println("NO");
			return;
		}

		int end = s.length();
		boolean all = false;
		boolean answer = false;
		do {
			boolean d = false;
			boolean der = false;
			boolean e = false;
			boolean eer = false;
			all = false;

			if (0 <= end - 5 && "dream".equals(s.substring(end - 5, end))) {
				d = true;
				end -= 5;
			}

			if (0 <= end - 7  && "dreamer".equals(s.substring(end - 7, end))) {
				der = true;
				end -= 7;
			}

			if (0 <= end - 5  && "erase".equals(s.substring(end - 5, end))) {
				e = true;
				end -= 5;
			}

			if (0 <= end - 6  && "eraser".equals(s.substring(end - 6, end))) {
				eer = true;
				end -= 6;
			}


			if (d || der || e || eer) {
				all = true;
			}

			if (0 == end) {
				System.out.println("YES");
				return;
			}

		} while (all);

		System.out.println("NO");

	}

}
