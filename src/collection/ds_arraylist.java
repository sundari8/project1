package collection;
import java.util.*;
public class ds_arraylist
{
    public static void main(String[] args)
     {
         List<String>list=new ArrayList<>();
         list.add("Java");
         list.add("python");
         list.add("C");
         list.add("C++");
         //printing Arraylist
         System.out.println("Contents :"+list);

         System.out.println("Does the contains 'java? '"+list.contains("JAVA"));

         //find the index position
         System.out.println("index of 'Java' :"+ list.indexOf("Java"));

         //swapping
         Collections.swap(list,0,2);
         System.out.println("Contents :"+list);
         System.out.println();

         //reverse
         Collections.reverse(list);
         System.out.println("Contents :"+list);
         System.out.println();

         //shuffle
         Collections.shuffle(list);
         System.out.println("Contents :"+list);
         System.out.println();

         //sort--Ascending
         Collections.sort(list);
         System.out.println("Contents :"+list);
         System.out.println();

         //Inserting the collection into An ArrayList-append to end of the list
         List<String>temp=new ArrayList<>();
         temp.add("SQL");
         temp.add("NoSQL");
         temp.add("MongoDB");
         list.addAll(temp);
         System.out.println("Temp list:"+temp);
         System.out.println("List :"+list);
         System.out.println();

         //ArrayList to array
         String[] arr1=new String[list.size()];
         //Transferring the content of the ArrayList into String Array
         list.toArray(arr1);
         System.out.println("Copied ArrayList :");
         for(String str:arr1)
         {
             System.out.println(str+" ");
         }
         System.out.println();

         //Creating Sublist
         List<String>sub=list.subList(2,5);
         System.out.println("Sublist :"+sub);
         System.out.println();


         //Deletion
         list.remove("C");
         list.remove(2);
         System.out.println("After deletion :"+list);
         System.out.println();


         //getter and setter
         list.set(1,"Go Language");
         System.out.println("Element at Index :"+list.get(1));
         System.out.println("List :"+list);
         System.out.println();

         //remove all the
         List<String>lang=new ArrayList<>();
         lang.add("SQL");
         lang.add("NoSQL");
         System.out.println("before the deletion :"+list);
         list.removeAll(lang);
         System.out.println("After the deletion :"+list);


         //Remove Duplicate from an array


     }
}
