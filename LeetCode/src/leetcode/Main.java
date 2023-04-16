package leetcode;

public class Main {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		int[] nums = {5,3,1,1,1,3,73,1};
		int k = 2;
		
		TopKFrequentElements tke = new TopKFrequentElements();
		System.out.println(tke.topKFrequent2(nums, k)); 
	}

}
