package atcoder;

import java.util.Scanner;

public class InteractiveSorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		char[] arr = new char[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = (char) ('A' + i);
		}

		
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
				System.out.println("? " + arr[j] + " " + arr[j+1]);
				//sc.close();
				
				String s = sc.next();
				
				if(s.equals(">")) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			}

		System.out.print("! ");
		for(char c : arr) {
			System.out.print(c);
		}
		System.out.flush();
		System.exit(0);
		sc.close();
		
	}

}
