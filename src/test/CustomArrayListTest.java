package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

class CustomArrayListTest {
	
	
//	Test Driven Development:
//	1. red: Write a test first for some functionality that currently fails
//	2. green: And then update your code so the test passes.
//	3. blue: And then Refactor your code, and still passing. 

	@Test
	void should_add_one_item_to_list()
	{
//		Three A's
//		Arrange, Act, Assert.

//		Arrange
		CustomList<Integer> customList = new CustomArrayList<>();
		
//		Act
		customList.add(8);
		
//		Assert
//		What would we except to happen?
//		How do we test that this happened?
		
		assertEquals(8, customList.get(0));
		assertEquals(1, customList.getSize());	
		
	}
	
	

}
