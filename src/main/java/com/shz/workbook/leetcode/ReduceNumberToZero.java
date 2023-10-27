/**
 * 
 */
package com.shz.workbook.leetcode;

/**
 * @author shenazz
 */
public class ReduceNumberToZero {

	public static void main(String[] args) {
		ReduceNumberToZero.Solution2 solution = new ReduceNumberToZero().new Solution2();
		int result = solution.numberOfSteps(17);
		System.out.println(result);
	}

	//O(n) and O(1)
	class Solution1 {

		public int numberOfSteps(int num) {
			int steps = 0;
			while (num > 0) {
				if (num % 2 == 0) {
					num = num / 2;
				} else {
					num = num - 1;
				}

				steps++;
			}
			return steps;
		}
	}

	//O(n) and O(1)
	class Solution2 {

		public int numberOfSteps(int num) {
			if (num == 0) {
				return 0;
			}
			int steps = 0;
			int oddBits = 0;
			while (num > 0) {
				oddBits += num & 1;
				num >>= 1;
				steps++;
			}
			return steps + (oddBits - 1);
		}
	}

}
