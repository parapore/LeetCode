package atcoder;

import java.util.Scanner;

public class BreakNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		/** 改良後コード⇩ **/
		int max = 0;
		int answer = 1;//改良
		for (int i = n; i > 0; i--) {
			int count = 0;
			int half = i;
			while (half % 2 == 0) {//改良

					half = half / 2;
					count++;

					if (max < count) {
						answer = i;
						max = count;
					}
			}
		}
		System.out.println(answer);
		
		
		
		
		/**　改良前コード⇩ **/
		int max2 = 0;
		int answer2 = 0;
		for(int i = n; i > 0; i--) {
			int count = 0;
			boolean b = true;
			int half = i;
			while(b) {
				
				
				if(half % 2 ==0) {
					half = half / 2;
					count++;
					b = true;
					
					if(max2 < count) {
						answer2 = i;
						max2 = count;
					}
				} else {
					b = false;
				}
			}
		}
		if(answer2 == 0) {
			System.out.println(1);
		} else {
			System.out.println(answer2);
		}
		
	}

}
