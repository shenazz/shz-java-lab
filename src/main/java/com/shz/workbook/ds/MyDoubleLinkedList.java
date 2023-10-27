/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Iterator;

/**
 * Doubly linked list
 */
public class MyDoubleLinkedList<T> implements Iterable<T> {

	private MyDoubleLink<T> first;

	private MyDoubleLink<T> last;

	private int size;

	public boolean isEmpty() {
		return first == null;
	}

	public T getHead() {
		T data = null;
		if (!isEmpty()) {
			data = first.getData();
		}
		return data;
	}

	public T getTail() {
		T data = null;
		if (!isEmpty()) {
			data = last.getData();
		}
		return data;
	}

	//O(n)
	public T get(int index) {
		T value = null;

		if (index >= size) {
			throw new IndexOutOfBoundsException("Out of bound!");
		}

		MyDoubleLink<T> current = last;
		int tracker = 0;
		while (current != null) {
			if (tracker++ == index) {
				value = current.getData();
				break;
			}
			current = current.getPrevious();
		}

		return value;
	}

	//O(1)
	public void addHead(T t) {
		MyDoubleLink<T> newLink = new MyDoubleLink<T>(t);
		newLink.setNext(first);

		if (isEmpty()) {
			last = newLink;
		} else {
			first.setPrevious(newLink);
		}

		first = newLink;

		size++;
	}

	//O(1)
	public boolean addTail(T t) {

		MyDoubleLink<T> newLink = new MyDoubleLink<T>(t);
		newLink.setPrevious(last);

		if (isEmpty()) {
			first = newLink;
		} else {
			last.setNext(newLink);
		}

		last = newLink;

		size++;

		return true;
	}

	//O(1)
	public boolean removeHead() {
		if (isEmpty()) {
			return false;
		}

		first = first.getNext();

		if (isEmpty()) {
			last = null;
		} else {
			first.setPrevious(null);
		}

		size--;

		return true;
	}

	//O(1)
	public boolean removeTail() {
		if (isEmpty()) {
			return false;
		}

		last = last.getPrevious();

		if (last == null) {
			first = null;
		} else {
			last.setNext(null);
		}

		size--;

		return true;
	}

	//O(n)
	public boolean contains(T data) {
		boolean contains = false;

		if (isEmpty()) {
			return contains;
		}

		MyDoubleLink<T> current = first;
		while (current != null) {
			contains = current.getData().equals(data);
			if (contains) {
				break;
			}

			current = current.getNext();
		}

		return contains;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "";
		}

		StringBuilder value = new StringBuilder();
		MyDoubleLink<T> current = first;
		while (current != null) {
			value.append(current.getData());
			current = current.getNext();
			if (current != null) {
				value.append(",");
			}
		}
		return value.toString();
	}

	@Override
	public Iterator<T> iterator() {
		return new MyLinkedListIterator<T>(first);
	}
}
