import java.util.Scanner;
public class Quiz {
    public static void main(String[] args){
        int Score=0;
       Scanner scan=new Scanner(System.in);
       System.out.println("*******Welcome to Quiz World*******");
        System.out.println("Do you want to play quiz (Yes or No) :");
        String ans=scan.nextLine();
        if(ans.equalsIgnoreCase("yes"))
        {
            System.out.println("Question :1");
            System.out.println("Which language is interpreter?");
            System.out.println("1.Java");
            System.out.println("2.C++");
            System.out.println("3.Javascript");
            System.out.println("4.Ruby");
            System.out.println("    ");
            System.out.println("Which is the correct answer :");
            int result=scan.nextInt();

            if(result==3)
            {
                System.out.println("correct");
                Score+=5;
                System.out.println("your Score :"+Score);
                System.out.println("    ");
                System.out.println("Question :2");
                System.out.println("Who is Java Founder?");
                System.out.println("1. Dennis Ritchie");
                System.out.println("2. Bjarne Stroustrup");
                System.out.println("3.Guido van Rossum");
                System.out.println("4.James Gosling");
                System.out.println("Which is the correct answer :");
                int ques2=scan.nextInt();

                if(ques2==4)
                {
                    System.out.println("correct");
                    Score+=5;
                    System.out.println("your Score :"+Score);
                    System.out.println("    ");
                    System.out.println("Question :3");
                    System.out.println("Which one is not datatype?");
                    System.out.println("1.byte");
                    System.out.println("2.swap");
                    System.out.println("3.int");
                    System.out.println("4.double");
                    System.out.println("    ");
                    System.out.println("Which is the correct answer :");
                    int ques3=scan.nextInt();
                    if(ques3==2)
                    {
                        System.out.println("correct");
                        Score+=5;
                        System.out.println("your Score :"+Score);
                        System.out.println("CONGRADULATIONS!");

                    }
                    else{
                        System.out.println("In Correct");
                        System.out.println("your Score :"+Score+5);
                    }

                }
                else{
                    System.out.println("In Correct");
                    System.out.println("your Score :"+Score+5);
                }
            }
           else
           {
                System.out.println("In Correct");
               System.out.println("your Score :"+Score);
            }
        }
        else
        {
            System.out.println("Ok Bye!");
            System.out.println("Will see you next time.");
        }

    }
}
