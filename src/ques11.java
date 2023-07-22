import java.util.Scanner;
    public class ques11 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter previous meter reading :");
            float previous = scan.nextFloat();
            System.out.println("Enter cuerrent meter reading :");
            float current = scan.nextFloat();
            System.out.println("per unit");
            float unit = scan.nextFloat();
            float x = current- previous ;
            float y = x * unit;
            System.out.println("You have used" + unit + "unit and the charges to pay is RS." + y);
        }
    }