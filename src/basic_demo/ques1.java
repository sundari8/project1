
    import java.util.Scanner;
    public class ques1 {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter num1");
            int num1 = scan.nextInt();
            System.out.println("Enter num2");
            int num2 = scan.nextInt();
            System.out.println("Enter num3");
            int num3 = scan.nextInt();
            int temp;

            temp = num3;
            num3 = num1;
            num1 = num2;
            num2 = temp;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
        }
    }
