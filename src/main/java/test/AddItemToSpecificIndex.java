package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddItemToSpecificIndex {
	private CustomList<String> list;
	private String item1;
	private String item2;

	@BeforeEach
	public void setUp() {
		list = new CustomArrayList<>();
		item1 = "Hello";
		item2 = "World";
	}

	@Test
	public void testAddValid() {
		assertTrue(list.add(0, item1));
		assertEquals(1, list.size());
		assertEquals(item1, list.get(0));

		assertTrue(list.add(1, item2));
		assertEquals(2, list.size());
		assertEquals(item2, list.get(1));

		assertTrue(list.add(0, null));
		assertEquals(3, list.size());
		assertNull(list.get(0));

		ArrayList<String> expected = new ArrayList<>();
		expected.add(null);
		expected.add(item1);
		expected.add(item2);
		assertEquals(expected, list);
	}

	@Test
	public void testAddInvalidIndex() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			list.add(-1, item1);
		});
	}

	@Test
	public void testAddInvalidItem() {
		String invalidItem = "";
		assertThrows(IllegalArgumentException.class, () -> {
			list.add(0, invalidItem);
		});
	}

	@Test
	public void testAddToMiddle() {
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		assertTrue(list.add(2, "X"));
		assertEquals(6, list.size());
		assertEquals("A", list.get(0));
		assertEquals("B", list.get(1));
		assertEquals("X", list.get(2));
		assertEquals("C", list.get(3));
		assertEquals("D", list.get(4));
		assertEquals("E", list.get(5));
	}

}

