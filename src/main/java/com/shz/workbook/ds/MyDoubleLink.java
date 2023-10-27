/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Objects;

/**
 * 
 */
class MyDoubleLink<T> {

	private T data;

	private MyDoubleLink<T> previous;

	private MyDoubleLink<T> next;

	public MyDoubleLink(T data) {
		this.data = data;
	}

	public MyDoubleLink<T> getPrevious() {
		return previous;
	}

	public void setPrevious(MyDoubleLink<T> previous) {
		this.previous = previous;
	}

	MyDoubleLink<T> getNext() {
		return next;
	}

	void setNext(MyDoubleLink<T> next) {
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
		MyDoubleLink other = (MyDoubleLink) obj;
		return Objects.equals(data, other.data) && Objects.equals(next, other.next) && Objects.equals(previous, other.previous);
	}

}
