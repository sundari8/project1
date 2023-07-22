import java.util.Scanner;
    public class ques12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of heads :");
            int heads = scan.nextInt();

            System.out.println("Enter the number of legs :");
            int legs = scan.nextInt();
            int x = heads * 2;
            int y = legs-x;
            int z = heads -y;
            System.out.println("Chicken =" + y);
            System.out.println("Rabbit =" + z);

        }
    }
