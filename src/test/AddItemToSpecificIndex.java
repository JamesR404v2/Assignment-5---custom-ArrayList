package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.*;


public class AddItemToSpecificIndex {
	
//	Arrange

	  // Declaring variables for testing
	  private CustomArrayList<String> list; // The list to be tested
	  private String item1; // An item to be added
	  private String item2; // Another item to be added

	  // Setting up the variables before each test
	  @Before
	  public void setUp() {
	    list = new CustomArrayList<>(); // Creating an empty list
	    item1 = "Hello"; // Assigning a value to item1
	    item2 = "World"; // Assigning a value to item2
	  }

	  // Testing the add method with valid index and item (Arrange, Act and Assert)
	  @Test
	  public void testAddValid() {
	    assertTrue(list.add(0, item1)); // Adding item1 at index 0 (should return true)
	    assertEquals(1, list.size()); // Checking that the list size is increased by one
	    assertEquals(item1, list.get(0)); // Checking that the list contains item1 at index 0

	    assertTrue(list.add(1, item2)); // Adding item2 at index 1 (should return true)
	    assertEquals(2, list.size()); // Checking that the list size is increased by one again
	    assertEquals(item2, list.get(1)); // Checking that the list contains item2 at index 1

	    assertTrue(list.add(0, null)); // Adding null at index 0 (should return true)
	    assertEquals(3, list.size()); // Checking that the list size is increased by one again
	    assertNull(list.get(0)); // Checking that the list contains null at index 0

	    ArrayList<String> expected = new ArrayList<>(); 
	      expected.add(null); 
	      expected.add(item1); 
	      expected.add(item2); 
	      assertEquals(expected,list); 
	        /*Checking that adding items does not overwrite existing items but shifts them right*/
	    
	   }

	   /*Testing the add method with invalid index and valid item (Arrange and Assert)*/
	   @Test(expected = IndexOutOfBoundsException.class) 
	   public void testAddInvalidIndex() {
	     list.add(-1,item1); /*Adding an item at negative index (should throw exception)*/
	     fail("Expected IndexOutOfBoundsException"); /*Failing if no exception is thrown*/
	   }

	   /*Testing the add method with valid index and invalid item (Arrange and Assert)*/
	   @Test(expected = IllegalArgumentException.class) 
	   public void testAddInvalidItem() {
	     String invalidItem = ""; /*Creating an invalid empty string*/
	     list.add(0,invalidItem); /*Adding an invalid empty string at index 0 (should throw exception)*/
	     fail("Expected IllegalArgumentException"); /*Failing if no exception is thrown*/
	   }
	
}
	
//	
//
//	@Test
//	void test() 
//	{
////		Arrange
//		
//        CustomList<Integer> list = new CustomArrayList<Integer>();
//
//        for (int i = 0; i < 7; i++) 
//        {
//            list.add(i);
//        }
//  
//		
////		Act
//		boolean list.add(5, "blurp");
//		
////		Assert
//		
////		Assert that string "blurp" is on index 4.
//		fail("Not yet implemented"); // TODO
//		
////		Assert that the size is now 8 instead of 7.
//		
//		assertEquals 	list.getSize(= 8
//		
//	}
//
//
//
//}
