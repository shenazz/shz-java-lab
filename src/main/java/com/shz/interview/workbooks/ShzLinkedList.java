/**
 * 
 */
package com.shz.interview.workbooks;

/**
 *  Doubly linked list
 */
public class ShzLinkedList<T> {

	private ShzLink<T> first;

	private ShzLink<T> last;

	private int size;

	public boolean isEmpty() {
		return first == null;
	}

	//O(n)
	public T get(int index) {
		T value = null;

		if (isEmpty()) {
			return value;
		}

		if (index >= size) {
			throw new RuntimeException("Out of bound!");
		}

		ShzLink<T> current = last;
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
	public void addFirst(T t) {
		ShzLink<T> newLink = new ShzLink<T>(t);
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
	public boolean addLast(T t) {

		ShzLink<T> newLink = new ShzLink<T>(t);
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
	public boolean deleteFirst() {
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
	public boolean deleteLast() {
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

		ShzLink<T> current = first;
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
		StringBuilder value = new StringBuilder();
		ShzLink<T> current = first;
		while (current != null) {
			value.append(current.getData());
			current = current.getNext();
			if (current != null) {
				value.append(",");
			}
		}
		return value.toString();
	}

}
