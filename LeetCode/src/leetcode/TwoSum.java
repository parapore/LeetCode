package leetcode;

import java.util.HashMap;
import java.util.Map;

//配列numsの数値を足してtargetと同じ値になる組み合わせを探す
public class TwoSum {
	
	
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
    	
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i + 1; j < nums.length; j++) {
    			if(nums[i] + nums[j] == target) {
    				answer[0] = i;
    				answer[1] = j;
    				
    				return  answer;
    			}
    		}
    	}
    	return null;
    }
    
	// HashMapバージョン
    /** 結果はWrong。
     * Target = 6; nums = {3, 1, 3}の場合
     * HashMapに重複するキーを登録してしまうため
     * 
     * あとTarget = 4 nums{2, 1, 3}もだめ。
     * 答え[0, 0] を返す可能性があるため。本来は[1, 2]
     *  **/
    public int[] twoSum2(int[] nums, int target) {
    	int[] answerArray = new int[2];
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	// 配列をHashMapに格納
    	for(int i = 0; i < nums.length; i++) {
    		map.put(nums[i], i); //←同じKeyだと上書きされてしまう
    	}
    	
    	// 1重ループで答え探し
    	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		int answer = target - entry.getKey();
    		
    		answerArray[0] = map.get(answer);
    		answerArray[1] = entry.getValue();
    		
    		return answerArray;
    	}
    	return null;
    }
}
