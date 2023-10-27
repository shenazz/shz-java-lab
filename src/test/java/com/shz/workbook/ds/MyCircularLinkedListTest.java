/**
 * 
 */
package com.shz.workbook.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * @author shenazz
 *
 */
public class MyCircularLinkedListTest {

	@Test
	public void given_nonEmptyList_when_toString() {

		//given
		MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("b");
		list.add("1");

		//when
		String result = list.toString();

		//then
		assertEquals("1,b,A", result);
		assertEquals(3, list.getSize());

	}

	@Test
	public void given_circularList_when_remove() {

		//given
		MyCircularLinkedList<String> list = new MyCircularLinkedList<>();

		//when
		try {
			list.remove(1);
			fail();
		} catch (IndexOutOfBoundsException e) {
			//then
			// expected
		}

		list = new MyCircularLinkedList<>();
		list.add("A");

		//when
		list.remove(0);

		//then
		assertEquals(0, list.getSize());
		assertEquals("", list.toString());

		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		list.remove(0);

		//then
		assertEquals(2, list.getSize());
		assertEquals("B,A", list.toString());

		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		list.remove(1);

		//then
		assertEquals(2, list.getSize());
		assertEquals("C,A", list.toString());

		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		list.remove(2);

		//then
		assertEquals(2, list.getSize());
		assertEquals("C,B", list.toString());

	}

	@Test
	public void given_circularList_when_iterate() {
		//given
		MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
		list.add("2");
		list.add("A");
		list.add("b");
		list.add("c");
		list.add("1");

		//when
		StringBuilder builder = new StringBuilder();
		for (String entry : list) {
			builder.append(entry);
		}

		//then
		assertEquals("1cbA2", builder.toString());

		//given
		list = new MyCircularLinkedList<>();

		//when
		builder = new StringBuilder();
		for (String entry : list) {
			builder.append(entry);
		}

		//then
		assertEquals("", builder.toString());

	}

	@Test
	public void given_circularList_when_get() {
		//given
		MyCircularLinkedList<String> list = new MyCircularLinkedList<>();
		list.add("2");
		list.add("A");
		list.add("b");

		//when
		String result = list.get(0);

		//then
		assertEquals("b", result);

		//when
		result = list.get(1);

		//then
		assertEquals("A", result);

		//when
		result = list.get(2);

		//then
		assertEquals("2", result);

		//when
		try {
			result = list.get(3);
			fail();
		} catch (Exception e) {
			//then
			// expected
		}

	}

}
