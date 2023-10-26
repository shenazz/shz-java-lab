/**
 * 
 */
package com.shz.interview.workbooks;

import java.util.Iterator;

/**
 * 
 */
public class ShzLinkedListIterator<T> implements Iterator<ShzLink<T>> {

	private ShzLinkedList<T> linkedList;

	public ShzLinkedListIterator(ShzLinkedList<T> linkedList) {
		this.linkedList = linkedList;
	}

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public ShzLink<T> next() {
		return null;
	}

}
