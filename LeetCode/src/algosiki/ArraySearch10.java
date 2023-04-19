package algosiki;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySearch10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		Map<Integer, Integer>map = new HashMap<>();// 値、出現数
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			if(map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			}else {
				map.put(num, 1);
			}
		}

		int[] ansArr = new int[n];
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			ansArr[entry.getValue()-1] = entry.getKey();
		}
		
		for(int i = ansArr.length -1; i >= 0; i--) {
			int answer = ansArr[i];
			if(answer > 0) {
				System.out.println(answer);
				break;
			}
		}

	}
}
