
/**
 * Write a description of class mutiplypractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import static java.lang.System.out;
import java.util.Scanner;
public class bigmultiply
{ 

    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);

        int userLimit=0;
        int across=0;
        int down=0;
        int answer=0;
        out.println("Welcome to the multiplication program");
        out.println("Please enter a number between 1 and 20 (I do aplolgize but anything larger than 20 will make the computer catch fire)");
        out.println("lol I am only kidding! (but seriously I can only go up to 20)");
        out.println("_______________________________________________________________________________________________________________________");
        userLimit=keyboard.nextInt();
        if (userLimit<=20)
        {
                out.println(" ");
                for(across=1;across<=userLimit;across++)
                {
                    out.print(" ");

                    for(down=1;down<=userLimit;down++)
                    {
                        
                        answer=down*across;
                        if(answer<10)
                        {
                        out.print(" "+answer+" ");
                        
                        
                        }
                        else if(answer>=100)
                        {
                            out.print(answer+" ");
                            
                            
                        }   
                        else
                        {
                            out.print(answer+" ");
                        }
                            

                    }
                    out.println(" ");
                }

        }   
            else
            {
                out.println("The program will exit now. Please user a number less than 20 the next go around.");
            }
        
    }
}
