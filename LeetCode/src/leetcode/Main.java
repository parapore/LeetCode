package leetcode;

public class Main {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		int[] nums = {1,2};
		int k = 2;
		
		TopKFrequentElements tke = new TopKFrequentElements();
		System.out.println(tke.topKFrequent(nums, k)); 
	}

}
