import java.util.Scanner;
public class ques15 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Year: ");
        int year=scan.nextInt();
        int x=year%100;
        System.out.println("last 2 digit "+x);

    }
}
