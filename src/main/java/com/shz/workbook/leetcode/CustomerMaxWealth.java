/**
 * 
 */
package com.shz.workbook.leetcode;

/**
 * @author shenazz
 */
public class CustomerMaxWealth {

	public static void main(String[] args) {
		CustomerMaxWealth.Solution1 solution = new CustomerMaxWealth().new Solution1();
		int maximumWealth = solution.maximumWealth(new int[][] { { 1, 2, 3 }, { 3, 2, 1 } });
		System.out.println(maximumWealth);
	}

	//O(n2) and O(1)
	class Solution1 {

		public int maximumWealth(int[][] accounts) {
			int maxSum = 0;
			for (int i = 0; i < accounts.length; i++) {
				int rowSum = 0;
				int[] row = accounts[i];
				for (int j = 0; j < row.length; j++) {
					rowSum += row[j];
				}
				if (rowSum > maxSum) {
					maxSum = rowSum;
				}
			}
			return maxSum;
		}
	}

}
