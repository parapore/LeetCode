package atcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//移動
		int m = sc.nextInt();//アイテム個数
		int h = sc.nextInt();//体力
		int k = sc.nextInt();//k未満なら回復
		
		

		
		String s = sc.next();
		
		Set<String> set = new HashSet<>();
		for(int i = 0; i < m; i++) {
		StringBuffer sb = new StringBuffer();		
		sb.append(String.valueOf(sc.nextInt()));
		sb.append(",");
		sb.append(String.valueOf(sc.nextInt()));
		set.add(sb.toString());
	}
		
		int x = 0;
		int y = 0;
		for(int i = 0; i < n; i++) {
			char c = s.charAt(i);
			--h;
			if(h < 0) {
				System.out.println("No");
				return;
			}
			
			if(c == 'R') {
				++x;
				
			}
			
			if(c == 'L') {
				--x;
			}
			
			if(c == 'U') {
				++y;
			}
			
			if(c == 'D') {
				--y;
			}
			
			int count = 0;
			
			if(set.contains(String.valueOf(x) + ","+ String.valueOf(y))) {
				if(h < k) {
					h = k;
					set.remove(String.valueOf(x) + ","+ String.valueOf(y));
				}
			}

		}
		System.out.println("Yes");
		

	}
}
