package algosiki;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pangram {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		Set<Character> used = new HashSet<>();

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();

		}

		int ans = Integer.MAX_VALUE;
		int count = 0;
		for (int S = 0; S < (1 << n); S++) {

			used.clear();
			count = 0;
			//全配列チェック
			for (int i = 0; i < n; i++) {

				if ((S & (1 << i)) != 0) {
					count++;

					// 選択した文字列を記録
					for (int j = 0; j < s[i].length(); j++) {
						char c = s[i].charAt(j);
						used.add(c);

					}

				}
			}

			if (used.size() == 26) {
				ans = Math.min(ans, count);
			}
			
		}
		if (ans == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}
}