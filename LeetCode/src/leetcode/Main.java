package leetcode;

public class Main {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		int[] nums = {1,2,3,4};
		int k = 2;
		
		ProductOfArrayExceptSelf tke = new ProductOfArrayExceptSelf();
		System.out.println(tke.productExceptSelf2(nums)); 
	}

}
