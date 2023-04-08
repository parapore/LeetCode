package leetcode;

public class Main {

	public static void main(String[] args) {
		int[] nums = {2,7,11,2};
		TwoSum ts = new TwoSum();
		int[] a = ts.twoSum(nums, 4);
		System.out.println(a[0] + "：" + a[1]);
	}

}
