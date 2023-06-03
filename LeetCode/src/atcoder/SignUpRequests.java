package atcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SignUpRequests {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<String> s = new HashSet<>();
		
		for(int i = 0; i < n; i++) {
			String si = sc.next();
			if(!s.contains(si)) {
				s.add(si);
				System.out.println(i+1);
			}
		}

	}
}
