package algosiki;

import java.util.Scanner;

public class AllSearchString5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		char[] arr = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if(arr[i] == (arr[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
