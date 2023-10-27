/**
 * 
 */
package com.shz.workbook.ds;

import java.util.Objects;

/**
 * 
 */
class MyLink<T> {

	private T data;

	private MyLink<T> next;

	public MyLink(T data) {
		this.data = data;
	}

	MyLink<T> getNext() {
		return next;
	}

	void setNext(MyLink<T> next) {
		this.next = next;
	}

	T getData() {
		return data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, next);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyLink other = (MyLink) obj;
		return Objects.equals(data, other.data) && Objects.equals(next, other.next);
	}

}
