package test;



import com.coderscampus.arraylist.CustomArrayList;
import com.coderscampus.arraylist.CustomList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomListTest

{

    @Test
    void testCustomList() {
        CustomList<String> myCustomList = new CustomArrayList<>();
        List<String> elements = Arrays.asList("element 1", "element 2", "element 3", "element 4", "element 5", "element 6", "element 7");
        elements.forEach(myCustomList::add);

        for (int i = 0; i < myCustomList.getSize(); i++) {
            assertEquals(elements.get(i), myCustomList.get(i));
        }
//        Adding a print statement to be able to double check if the unit test populated the customerclass
//        TODO: can remove before handing in the assignment.
        System.out.println(myCustomList);
        
        
    }
}
