/**
 * 
 */
package com.shz.workbook.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenazz
 */
public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz.Solution1 solution = new FizzBuzz().new Solution1();
		List<String> result = solution.fizzBuzz(15);
		System.out.println(result);
	}

	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	//O(n) and O(n)
	class Solution1 {

		public List<String> fizzBuzz(int n) {
			List<String> result = new ArrayList<String>();
			for (int i = 1; i <= n; i++) {
				int moduluo3 = i % 3;
				int moduluo5 = i % 5;
				if (moduluo3 == 0 && moduluo5 == 0) {
					result.add(FIZZ + BUZZ);
				} else if (moduluo3 == 0) {
					result.add(FIZZ);
				} else if (moduluo5 == 0) {
					result.add(BUZZ);
				} else {
					result.add(Integer.toString(i));
				}
			}
			return result;
		}
	}

}
