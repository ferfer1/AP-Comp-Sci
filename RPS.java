import java.util.Scanner;

/**
 * Write a description of class RPS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RPS
{
    private static Scanner in = new Scanner(System.in);
        
    public static void main(String [] args)
    {
        int stopper = 0;
        while(stopper == 0)
        {
            String computer = "";
            int userCheck = 0;
            String user = "";
            
            while(userCheck == 0)
            {
                System.out.println ("rock, paper, or scissors?: ");
                user = in.nextLine();
                
                if(user.equals("paper") || user.equals("rock") || user.equals("scissors"))
                {
                    userCheck = 1;
                }
                else
                {
                    System.out.println("That was not a valid option type either rock, paper, or scissors");
                }
            }
            
            System.out.println("User: " + user);
            double computer1 = Math.random();
            
            if(computer1 <= 0.33)
            {
                computer = "rock";
            }
            else if(computer1 <= 0.66 && computer1 > 0.33)
            {
                computer = "scissors";
            }
            else
            {
                computer = "paper";
            }
            
            System.out.println("Computer: " + computer);
            
            if(user.equals ("rock") && computer.equals ("scissors") || user.equals ("paper") && computer.equals ("rock") || user.equals ("scissors") && computer.equals ("paper"))
            {
                System.out.println("User wins!");
            }
            else if(user.equals ("rock") && computer.equals ("paper") || user.equals ("paper") && computer.equals ("scissors") || user.equals ("scissors") && computer.equals ("rock"))
            {
                System.out.println("Computer Wins!");
            }
            else
            {
                System.out.println("It was a tie");
            }
            
            int endCheck = 0;
            
            while(endCheck == 0)
            {
                System.out.println("Play again?");
                String end = in.nextLine();
            
                if(end.equals("no"))
                {
                    stopper = 1;
                    endCheck = 1;
                }
                else if(end.equals("yes"))
                {
                    endCheck = 1;
                }
                else
                {
                    System.out.println("Please input either yes or no.");
                }
            }
        }
        System.out.println("Thanks for playing!");
    }
}
