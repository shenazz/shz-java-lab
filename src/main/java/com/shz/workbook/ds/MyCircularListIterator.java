/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Iterator;

/**
 * 
 */
public class MyCircularListIterator<T> implements Iterator<T> {

	private MyLink<T> current;

	private int size;

	private int currentIndex;

	public MyCircularListIterator(int size, MyLink<T> current) {
		this.size = size;
		this.current = current;
	}

	@Override
	public boolean hasNext() {
		return currentIndex < size;
	}

	@Override
	public T next() {
		if (current == null) {
			throw new IllegalStateException("Iterator is empty");
		}

		currentIndex++;

		T data = current.getData();

		current = current.getNext();

		return data;
	}

}
