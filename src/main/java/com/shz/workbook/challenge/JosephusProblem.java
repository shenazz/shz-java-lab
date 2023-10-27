/**
 * 
 */
package com.shz.workbook.challenge;

import com.shz.workbook.ds.MyCircularLinkedList;

/**
 * 
 */
public class JosephusProblem {

	public static int getSurvivor(int circleSize, int steps) {

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
