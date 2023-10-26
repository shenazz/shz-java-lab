/**
 * 
 */
package com.shz.interview.workbooks;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author shenazz
 *
 */
public class ShzLinkedListTest {

	@Test
	public void given_emptyList_when_isEmpty() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();

		//when
		boolean result = list.isEmpty();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_isEmpty() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst("hello");

		//when
		boolean result = list.isEmpty();

		//then
		assertFalse(result);
		assertEquals(1, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_toString() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst("A");
		list.addFirst("b");
		list.addFirst("1");

		//when
		String result = list.toString();

		//then
		assertEquals("1,b,A", result);
		assertEquals(3, list.getSize());

		//given
		list = new ShzLinkedList<>();
		list.addLast("b");
		list.addFirst("A");
		list.addFirst("1");
		list.addLast("C");

		//when
		result = list.toString();

		//then
		assertEquals("1,A,b,C", result);
		assertEquals(4, list.getSize());

	}

	@Test
	public void given_listWithNullValues_when_toString() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst(null);
		list.addFirst(null);

		//when
		String result = list.toString();

		//then
		assertEquals("null,null", result);
		assertEquals(2, list.getSize());

	}

	@Test
	public void given_nonEmptyList_when_deleteFirst() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst("A");
		list.addFirst("b");
		list.addFirst("c");

		//when
		boolean result = list.deleteFirst();

		//then
		assertTrue(result);
		assertEquals(2, list.getSize());

	}

	@Test
	public void given_emptyList_when_deleteFirst() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();

		//when
		boolean result = list.deleteFirst();

		//then
		assertFalse(result);
		assertTrue(list.isEmpty());

	}

	@Test
	public void given_nonEmptyList_when_contains() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst("A");
		list.addFirst("b");
		list.addFirst("1");

		//when

		//then
		assertEquals(3, list.getSize());
		assertTrue(list.contains("b"));
		assertFalse(list.contains("B"));

	}

	@Test
	public void given_nonEmptyList_when_getFirst() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addFirst("A");
		list.addFirst("b");
		list.addFirst("1");

		//when

		//then
		assertEquals(3, list.getSize());
		assertEquals("A", list.get(0));
		assertEquals("1", list.get(2));
		assertEquals("b", list.get(1));

	}

	@Test
	public void given_nonEmptyList_when_delete() {

		//given
		ShzLinkedList<String> list = new ShzLinkedList<>();
		list.addLast("2");
		list.addFirst("A");
		list.addFirst("b");
		list.addFirst("c");
		list.addLast("1");

		//when
		boolean result = list.deleteFirst();

		//then
		assertTrue(result);
		assertEquals(4, list.getSize());
		assertEquals("b,A,2,1", list.toString());

		result = list.deleteLast();

		//then
		assertTrue(result);
		assertEquals(3, list.getSize());
		assertEquals("b,A,2", list.toString());

		//when
		list = new ShzLinkedList<>();
		list.addLast("2");

		//when
		result = list.deleteFirst();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

		//when
		list = new ShzLinkedList<>();
		list.addFirst("2");

		//when
		result = list.deleteLast();

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());

	}

}
