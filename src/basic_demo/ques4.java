import java.util.Scanner;

public class ques4 {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Floating-point Number");
        double num1=scan.nextDouble();
       int x=(int)num1;

        System.out.printf("%d",x%10);

    }
}

