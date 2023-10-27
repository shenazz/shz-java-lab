/**
 * 
 */
package com.shz.workbook.leetcode;

/**
 * @author shenazz
 */
public class RunningSumArray {

	public static void main(String[] args) {
		RunningSumArray.Solution3 solution = new RunningSumArray().new Solution3();
		int[] sums = solution.runningSum(new int[] { 3, 1, 2, 10, 1 });
		for (int i = 0; i < sums.length; i++) {
			System.out.println(sums[i]);
		}
	}

	//O(n2) and O(n)
	class Solution1 {

		public int[] runningSum(int[] nums) {
			int[] sums = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				int sum = 0;
				for (int j = 0; j < i + 1; j++) {
					sum += nums[j];
				}
				sums[i] = sum;
			}
			return sums;
		}
	}

	//O(n) and O(n)
	class Solution2 {

		public int[] runningSum(int[] nums) {
			int[] sums = new int[nums.length];
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				sum += nums[i];
				sums[i] = sum;
			}
			return sums;
		}
	}

	//O(n) and O(1)
	class Solution3 {

		public int[] runningSum(int[] nums) {
			for (int i = 1; i < nums.length; i++) {
				nums[i] += nums[i - 1];
			}
			return nums;
		}
	}

}
