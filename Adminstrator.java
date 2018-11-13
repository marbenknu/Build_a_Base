import java.util.*;
import java.util.Scanner;

public class Adminstrator
//bruger ikke den klasse til noget.
{
   public void logon()
   {
      Scanner userInput = new Scanner(System.in);      
      System.out.println("Welcome to IMDB database");
      
      while(true)      
      {
      System.out.println("Insert admin ID: ");
      int adminID = userInput.nextInt();
      System.out.println("Insert admin password: ");
      int adminPW = userInput.nextInt();
         if (adminID == 1 && adminPW == 1)
         {
            System.out.println("Admin acces granted - Welcome:\n ");
            break;
         }
         else
         {
            System.out.println("Acces not granted - try again\n");
         }
      }
   }
}