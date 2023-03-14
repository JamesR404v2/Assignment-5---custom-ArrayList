package test;

import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayGrowTest {
    @Test
    public void testAdd() {
        CustomList<Integer> list = new CustomArrayList<Integer>();
        for (int i = 0; i < 40; i++) {
            list.add(i);
        }
        assertEquals(40, list.getSize());
    }
}
