/**
 * 
 */
package com.shz.interview.workbooks;

import java.util.Objects;

/**
 * 
 */
class ShzLink<T> {

	private T data;

	private ShzLink<T> previous;

	private ShzLink<T> next;

	public ShzLink(T data) {
		this.data = data;
	}

	public ShzLink<T> getPrevious() {
		return previous;
	}

	public void setPrevious(ShzLink<T> previous) {
		this.previous = previous;
	}

	ShzLink<T> getNext() {
		return next;
	}

	void setNext(ShzLink<T> next) {
		this.next = next;
	}

	T getData() {
		return data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next, previous);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShzLink other = (ShzLink) obj;
		return Objects.equals(data, other.data) && Objects.equals(next, other.next) && Objects.equals(previous, other.previous);
	}

}
