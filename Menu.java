import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Menu
{
 public static void StartMenu()
     throws FileNotFoundException
   {
      Scanner userInput = new Scanner(System.in);
      File f = new File("searchLog.txt");
      Scanner searchLog = new Scanner(f);
      Scanner console = new Scanner(System.in);
      Search log = new Search();
      Scanner returnMenu = new Scanner(System.in);
         
      //Søger på en serie
      System.out.print("What serie are you searching for?\n");
      String serieName;
      Search s = new Search();
      while (true)
     {  
         //Search.searchCount++;
         serieName = console.nextLine();
         s.searchLog(serieName);
         s.searchForSeries(serieName);
         System.out.println("Search again? \n 1. Yes \n 2. No\n 3. Searchlog");
         int search = userInput.nextInt();
         if (search == 1)
         {
            System.out.println("Make a new searching: ");
         }
            else if (search == 2)
         {
            System.out.println("Exiting program - See you next time!");
            break;
         }
            else if (search == 3)
         {
            System.out.println("Showing searchlog");
            while (searchLog.hasNextLine())
            {   
            String a = searchLog.nextLine();
            System.out.println(a);
            }
            System.out.println("\nReturn to search? \n 1. Yes \n 2. Exit program.");
            int retur = returnMenu.nextInt();
            
            if (retur == 1)
            {  
               System.out.println("Make a new searching: ");
               searchLog = new Scanner(f);
            }
            else if (retur == 2)
            {
               System.out.println("Exiting program");
               break;
            }
            else 
            {
               System.out.println("Not an option - please try again");
            }
         }   
         else 
         {
            System.out.println("Not an option - please try again");
         }
      }
   }
}