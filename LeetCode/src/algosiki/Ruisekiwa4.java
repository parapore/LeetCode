package algosiki;

import java.util.Scanner;

public class Ruisekiwa4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] kyaku = new int[n+1];
		int add = 0;
		kyaku[0] = 0;
		int count = 0;
		
		for(int i = 1; i < n+1; i++) {
			add += sc.nextInt();
			kyaku[i] = add;
		}
		
		int max = 0;
		int answer = 0;
		for(int i = 0; i < kyaku.length; i++) {
			
			if(i >= d && max <= kyaku[i] - kyaku[i-d]) {
				max = kyaku[i] - kyaku[i-d];
				answer = i;
			}
		}
		System.out.println(answer -d + "~" + (answer -1));
	}

}
