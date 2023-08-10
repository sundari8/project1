/*. Write a Java program to insert an element into the array list at the
first position.
ArrayList: [Black, White, Grey, Yellow, Red, Green]
Data to be Inserted: Burgundy
*/
package collection;
import java.util.*;
public class Insert
{
    public static void main(String[] args)
    {
        List<String>list = new ArrayList<>();
        list.add("Black");
        list.add("White");
        list.add("Grey");
        list.add("Yellow");
        list.add(" Red");
        list.add("Green");
        System.out.println("List :"+list);

        List<String>temp = new ArrayList<>();
        temp.add(" Burgundy");
        System.out.println("List :"+list);

    }
}
