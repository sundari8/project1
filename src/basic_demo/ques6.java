
    import java.util.Scanner;

    public class ques6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a width");
            float width = scan.nextFloat();
            System.out.println("Enter a length");
            float length = scan.nextFloat();
            System.out.println("perimeter=" + (2 * (length + width)));
            System.out.println("Area=" + (width * length));
        }
    }
