package atcoder;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GapExistence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			set.add(sc.nextInt());
		}

		//Setでも後で作ってみよう。
		for(int num : set) {
			int aj = num -x;
			if(set.contains(aj)) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
