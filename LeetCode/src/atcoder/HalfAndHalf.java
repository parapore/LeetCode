package atcoder;

import java.util.Scanner;

public class HalfAndHalf {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int ayen = sc.nextInt();
				int byen = sc.nextInt();
				int cyen = sc.nextInt();
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				long min = Long.MAX_VALUE;
				for(int ab = 0; ab <= (x+y)*2; ab++) {
					
					int a =  (int) Math.ceil((x - ab * 0.5));
					int b =  (int) Math.ceil((y - ab * 0.5));
					
					if(a < 0) {
						a = 0;
					}
					
					if(b < 0) {
						b = 0;
					}
					
					int sum = a*ayen + b*byen + ab*cyen;
					
					if(sum < min) {
						min = sum;
					}
				}
				System.out.println(min);
				
				//以下はTLEだった初回の解答
		//		long min = 999999999;
		//		for(int i = 0; i <= x; i++) {
		//			for(int j = 0; j <= y; j++) {
		//				int ab1 = (x - i)*2;
		//				int ab2 = (y - j)*2;
		//				int ab = -1;
		//				
		//				if(ab1 > ab2) {
		//					ab = ab1;
		//				} else {
		//					ab = ab2;
		//				}
		//				
		//				
		//				if(i+0.5*ab >= x
		//					&& j+0.5*ab >= y) {
		//					
		//					int sum = ayen*i + byen*j + cyen*ab;
		//					
		//					if(min > sum) {
		//						min = sum;
		//					}
		//				}
		//			}
		//		}
		//		System.out.println(min);


	}

}
