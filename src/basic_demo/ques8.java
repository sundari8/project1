package basic_demo;

import java.util.Scanner;

public class ques8 {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number of Years");
        float num1= scan.nextFloat();
        float min=60;
        float hour=1*min;
        float day=24*hour;
        float year=365*day;
        float x=num1*year;
        System.out.println("Total Number of Minutes in 5yrs is "+x);
    }
}
