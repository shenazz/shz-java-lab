/**
 * 
 */
package com.shz.workbook.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author shenazz
 *
 */
public class MyDoubleLinkedListTest {

	@Test
	public void given_emptyList_when_isEmpty() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();

		//when
		boolean result = list.isEmpty();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_isEmpty() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addHead("hello");

		//when
		boolean result = list.isEmpty();

		//then
		assertFalse(result);
		assertEquals(1, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_toString() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();

		//when
		String result = list.toString();

		//then
		assertEquals("", result);

		//given
		list = new MyDoubleLinkedList<>();
		list.addHead("A");
		list.addHead("b");
		list.addHead("1");

		//when
		result = list.toString();

		//then
		assertEquals("1,b,A", result);
		assertEquals(3, list.getSize());

		//given
		list = new MyDoubleLinkedList<>();
		list.addTail("b");
		list.addHead("A");
		list.addHead("1");
		list.addTail("C");

		//when
		result = list.toString();

		//then
		assertEquals("1,A,b,C", result);
		assertEquals(4, list.getSize());

	}

	@Test
	public void given_listWithNullValues_when_toString() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addHead(null);
		list.addHead(null);

		//when
		String result = list.toString();

		//then
		assertEquals("null,null", result);
		assertEquals(2, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_removeHead() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addHead("A");
		list.addHead("b");
		list.addHead("c");

		//when
		boolean result = list.removeHead();

		//then
		assertTrue(result);
		assertEquals(2, list.getSize());

	}

	@Test
	public void given_emptyList_when_removeHead() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();

		//when
		boolean result = list.removeHead();

		//then
		assertFalse(result);
		assertTrue(list.isEmpty());

	}

	@Test
	public void given_nonEmptyList_when_contains() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addHead("A");
		list.addHead("b");
		list.addHead("1");

		//when

		//then
		assertEquals(3, list.getSize());
		assertTrue(list.contains("b"));
		assertFalse(list.contains("B"));

	}

	@Test
	public void given_nonEmptyList_when_getHead() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addHead("A");
		list.addHead("b");
		list.addHead("1");

		//when

		//then
		assertEquals(3, list.getSize());
		assertEquals("A", list.get(0));
		assertEquals("1", list.get(2));
		assertEquals("b", list.get(1));

	}

	@Test
	public void given_nonEmptyList_when_remove() {

		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addTail("2");
		list.addHead("A");
		list.addHead("b");
		list.addHead("c");
		list.addTail("1");

		//when
		boolean result = list.removeHead();

		//then
		assertTrue(result);
		assertEquals(4, list.getSize());
		assertEquals("b,A,2,1", list.toString());

		result = list.removeTail();

		//then
		assertTrue(result);
		assertEquals(3, list.getSize());
		assertEquals("b,A,2", list.toString());

		//when
		list = new MyDoubleLinkedList<>();
		list.addTail("2");

		//when
		result = list.removeHead();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

		//when
		list = new MyDoubleLinkedList<>();
		list.addHead("2");

		//when
		result = list.removeTail();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_iterate() {
		//given
		MyDoubleLinkedList<String> list = new MyDoubleLinkedList<>();
		list.addTail("2");
		list.addHead("A");
		list.addHead("b");
		list.addHead("c");
		list.addTail("1");

		//when
		StringBuilder builder = new StringBuilder();
		for (String entry : list) {
			builder.append(entry);
		}

		//then
		assertEquals("cbA21", builder.toString());

		//given
		list = new MyDoubleLinkedList<>();

		//when
		builder = new StringBuilder();
		for (String entry : list) {
			builder.append(entry);
		}

		//then
		assertEquals("", builder.toString());

	}

}
