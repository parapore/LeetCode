package atcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NotSoDiverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[200001];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			 arr[sc.nextInt()] += 1;
		}
		
		Arrays.sort(arr);
		
		int syurui = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				syurui++;
				list.add(arr[i]);
			}
		}
		
		
		
		
		int change = syurui - k;
		int count = 0;
//		int index = 0;
		if(change < 1) {
			System.out.println(0);
			return;
		} else {

//			while(change > 0) {
//				change -= list.get(index);
//				count += list.get(index);
//				list.set(index, 0);
//				index++;
//			}
			
			for(int i = 0; i < list.size() -k; i++) {
				count += list.get(i);
			}
		}
		
		System.out.println(count);
	}
}