/**
 * 
 */
package com.shz.workbook.ds;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.shz.workbook.ds.MyCircularLinkedList;

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
		boolean result = list.remove(0);

		//then
		assertTrue(result);
		assertEquals(0, list.getSize());
		assertEquals("", list.toString());

		
		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		result = list.remove(0);

		//then
		assertTrue(result);
		assertEquals(2, list.getSize());
		assertEquals("B,A", list.toString());
		
		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		result = list.remove(1);

		//then
		assertTrue(result);
		assertEquals(2, list.getSize());
		assertEquals("C,A", list.toString());
		
		
		//given
		list = new MyCircularLinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");

		//when
		result = list.remove(2);

		//then
		assertTrue(result);
		assertEquals(2, list.getSize());
		assertEquals("C,B", list.toString());


	}

}
