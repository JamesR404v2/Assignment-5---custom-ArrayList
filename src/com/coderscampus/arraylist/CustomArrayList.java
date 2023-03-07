package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T>
{
	Object[] items = new Object[10];
	private int size = 0;

	@Override
	public boolean add(T item)
	{
		if (size == items.length)
		{

// create a temporary array and copy items into it
//			Object[] tempItems = CustomArrayList.copyOf(items, items.length);
			Object[] tempItems = copyOf(items, items.length);

			System.out.println("items: " + Arrays.toString(items));
			System.out.println("tempItems: " + Arrays.toString(tempItems));

// destroy the original items array
			items = null;

// recreate items as a new array with twice the size of tempItems
			items = new Object[tempItems.length * 2];

// copy tempItems array into the new items array
			System.arraycopy(tempItems, 0, items, 0, tempItems.length);



//			code that may be incorrect, may be causing the NullPointerException
//			for (int i = 0; i < tempItems.length; i++) {
//				items = (Object[]) tempItems[i];
//			}

// print the updated items array just for debugging, delete afterwards.
//			System.out.println(Arrays.toString(items));


		}
		// add the new item to the next available position in the array
		int nextAvailableIndex = 0;
		while (items[nextAvailableIndex] != null) {
			nextAvailableIndex++;
		}
		items[nextAvailableIndex] = item;

		// this is increasing the 'size' variable to track how many items are in the array.
		size++;
//		TODO: instead of incrementing the size variable by one each time, set the size to the actual size by calling the getSize method.
		return true;
	}

	@SuppressWarnings("unchecked")
	private static <T> T[] copyOf(T[] items, int length) {
		T[] copy = (T[]) new Object[length];
		System.arraycopy(items, 0, copy, 0, Math.min(length, items.length));
		return copy;
	}


	@Override
	public int getSize()
	{
		return size;
	}

	//	@SuppressWarnings("unchecked")
	@Override
	public T get(int index)
	{
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return (T) items[index];
	}

}
