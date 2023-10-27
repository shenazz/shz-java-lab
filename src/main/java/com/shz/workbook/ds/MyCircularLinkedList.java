/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Iterator;

/**
 * Singly linked circular list
 */
public class MyCircularLinkedList<T> implements Iterable<T> {

	private MyLink<T> first;

	private MyLink<T> last;

	private int size;

	public boolean isEmpty() {
		return first == null;
	}

	//O(n)
	public T get(int index) {
		T value = null;

		if (index >= size) {
			throw new IndexOutOfBoundsException("Out of bound!");
		}

		MyLink<T> current = first;
		for (int i = 0; i < size; i++) {
			if (i == index) {
				return current.getData();
			}

			current = current.getNext();
		}
		return value;
	}

	//O(1)
	public void add(T t) {
		MyLink<T> newLink = new MyLink<T>(t);
		newLink.setNext(first);

		if (isEmpty()) {
			newLink.setNext(newLink);
			last = newLink;
		} else {
			last.setNext(newLink);
		}

		first = newLink;

		size++;
	}

	public void remove(int index) {

		if (index >= size) {
			throw new IndexOutOfBoundsException("Out of bound!");
		}

		MyLink<T> current = first;
		MyLink<T> previous = null;
		for (int i = 0; i <= index; i++) {
			if (i == index) {
				if (previous != null) {
					previous.setNext(current.getNext());
				} else if (size == 1) {
					first = null;
					last = null;
				} else {
					first = current.getNext();
					last.setNext(first);
				}

			} else {
				previous = current;
				current = current.getNext();
			}
		}

		size--;

	}

	//O(n)
	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}

		StringBuilder value = new StringBuilder();
		MyLink<T> current = first;

		for (int i = 0; i < size;) {
			value.append(current.getData());
			current = current.getNext();
			if (current != null && ++i < size) {
				value.append(",");
			}

		}
		return value.toString();
	}

	//O(1)
	public int getSize() {
		return size;
	}

	@Override
	public Iterator<T> iterator() {
		return new MyCircularListIterator<>(size, first);
	}

}
