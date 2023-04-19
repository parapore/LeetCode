package leetcode;

// int配列の積の結果を出力する問題
// 配列の1個を除く要素同士での積の結果を出す
public class ProductOfArrayExceptSelf {

	// ブルートフォースアタック！時間切れ！
	public int[] productExceptSelf(int[] nums) {
		int[] answer = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			int product = 1;
			for (int j = 0; j < nums.length; j++) {

				if (i == j) {
					continue;
				} else {
					product = product * nums[j];
				}
			}
			answer[i] = product;
		}
		return answer;
	}

	public int[] productExceptSelf2(int[] nums) {
		int[] answer = new int[nums.length];
		int[] prefix = new int[nums.length];
		int[] postfix = new int[nums.length];

		prefix[0] = nums[0];
		for (int i = 0; i < nums.length - 1; i++) {
			// 1番目はそのままnumsを入れる
			// 2番目以降はループで入れる
			// なおprefix自身とnumsを掛け算する

			prefix[i + 1] = prefix[i] * nums[i + 1];

		}

		postfix[nums.length - 1] = nums[nums.length - 1];
		for (int i = nums.length - 1; i >= 1; i--) {

			postfix[i - 1] = postfix[i] * nums[i - 1];

			try {
				answer[i] = prefix[i - 1] * postfix[i + 1];
			} catch (ArrayIndexOutOfBoundsException e) {
				continue;
			}
		}
		answer[0] = postfix[1];
		answer[nums.length - 1] = prefix[nums.length - 2];
		return answer;
	}
}
