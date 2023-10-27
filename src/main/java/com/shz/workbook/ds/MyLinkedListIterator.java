/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Iterator;

/**
 * 
 */
public class MyLinkedListIterator<T> implements Iterator<T> {

	private MyDoubleLink<T> current;

	public MyLinkedListIterator(MyDoubleLink<T> current) {
		this.current = current;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public T next() {
		if (current == null) {
			throw new IllegalStateException("Iterator is empty");
		}

		T data = current.getData();

		current = current.getNext();

		return data;
	}
}
