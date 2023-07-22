import java.util.Scanner;
    public class ques9 {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int total=158;
            System.out.println("Enter the win win game :");
            float win=scan.nextFloat();
            System.out.println("Enter the lost in game :");
            float lost=scan.nextFloat();
            System.out.println("Enter the drown in game :");
            float drown=scan.nextFloat();
            float y=win*100/total;
            System.out.println("out of 158 games played,you have won "+win+"matches,lost "+lost+"matches and drown"+drown+"matches");


            System.out.println("Your winning percentage is"+y);

        }
    }
