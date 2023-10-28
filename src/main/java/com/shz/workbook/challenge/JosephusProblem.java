/**
 * 
 */
package com.shz.workbook.challenge;

import com.shz.workbook.ds.MyCircularLinkedList;

/**
 * 
 */
public class JosephusProblem {

	//O(n) and O(1) is stack memory is not considered
	public static int solution1(int circleSize, int steps) {
		if (circleSize < 2 || steps < 1) {
			throw new IllegalArgumentException();
		}

		return _solution1(circleSize, steps) + 1;
	}

	private static int _solution1(int n, int k) {
		if (n == 1) {
			return 0;
		}
		return (_solution1(n - 1, k) + k) % n;
	}

	//O(n^2) and O(n)
	public static int solution2(int circleSize, int steps) {

		if (circleSize < 2 || steps < 1) {
			throw new IllegalArgumentException();
		}

		MyCircularLinkedList<Integer> list = new MyCircularLinkedList<>();
		for (int i = circleSize; i > 0; i--) {
			list.add(i);
		}

		int index = 0;
		int stepTracker = 1;
		while (list.getSize() > 1) {
			if (stepTracker++ == steps) {
				list.remove(index);
				stepTracker = 1;
				index = index - 1;
			}

			if (++index == list.getSize()) {
				index = 0;
			}
		}

		return list.get(0);
	}
}
