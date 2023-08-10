package collection;

import java.util.*;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("apple");
        ll.add("Mango");
        ll.add("orange");
        ll.add("pineapple");


        System.out.println("lIST :" + ll);

        System.out.println("Does the contains 'Apple? '" + ll.contains("APPLE"));

        //find the index position
        System.out.println("index of 'orange' :" + ll.indexOf("orange"));

        //swapping
        Collections.swap(ll, 0, 2);
        System.out.println("Contents :" + ll);
        System.out.println();

        //reverse
        Collections.reverse(ll);
        System.out.println("Contents :" + ll);
        System.out.println();

        //shuffle
        Collections.shuffle(ll);
        System.out.println("Contents :"+ll);
        System.out.println();

        //sort--Ascending
        Collections.sort(ll);
        System.out.println("Contents :"+ll);
        System.out.println();

        //Inserting the collection into An ArrayList-append to end of the list
        List<String>temp=new ArrayList<>();
        temp.add("Tomato");
        temp.add("Carrot");
        temp.add("");
        ll.addAll(temp);
        System.out.println("Temp list:"+temp);
        System.out.println("List :"+ll);
        System.out.println();

        String[] arr1=new String[ll.size()];
        //Transferring the content of the LinkedList into String Array
        ll.toArray(arr1);
        System.out.println("Copied ArrayList :");
        for(String str:arr1)
        {
            System.out.println(str+" ");
        }
        System.out.println();

        List<String>sub=ll.subList(2,5);
        System.out.println("Sublist :"+sub);
        System.out.println();

        //Deletion
        ll.remove("apple");
        ll.remove(2);
        System.out.println("After deletion :"+ll);
        System.out.println();

        //getter and setter
        ll.set(1,"Gauva");
        System.out.println("Element at Index :"+ll.get(1));
        System.out.println("List :"+ll);
        System.out.println();

        //remove all the
        List<String>lang=new ArrayList<>();
        lang.add("Gauva");
        lang.add("Tomato");
        System.out.println("before the deletion :"+ll);
        ll.removeAll(lang);
        System.out.println("After the deletion :"+ll);
    }
}

    