package algosiki;

import java.util.Scanner;

public class AllSearchInt5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		for (int i = 1; i < n+1; i++) {
			if(i % 3 == 0 && i % 5 ==0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0) {
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
		
	}

}
