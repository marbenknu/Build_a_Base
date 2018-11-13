import java.util.*;
import java.io.*;
import java.util.Scanner;


public class Search 
{  
   public String[] searchForSeries(String serie)
   {
      String[] result= new String[1000000];
      boolean found = false;
     
     // FileDataHandler.seriesArray.length-1, skulle bruge det,men pga fejlsøgning bruger et tal.
     String id = " "; 
     String genre = ""; 
      for(int i = 1; i< FileDataHandler.seriesArray.length-1; i++)
      {
         
         if(FileDataHandler.seriesArray[i] == null){
            break;
         }
         
         String temp = FileDataHandler.seriesArray[i].primaryTitel;
         //System.out.println(i + " "+ temp);
         //Det bruger vi så vi kan finde titelen i arrayet
         if (serie.equals(temp))
         {
            found= true;
            id = FileDataHandler.seriesArray[i].tconst;
            genre = FileDataHandler.seriesArray[i].genre;
            break;
         }

      }
      
      String parentTconst = " ";
      int count =0;
      for(int j = 1; j< FileDataHandler.episodeArray.length-1;j++)
      {
      
         if(FileDataHandler.episodeArray[j] == null){
            break;
         }
      
        parentTconst = FileDataHandler.episodeArray[j].parentTconst;
        //System.out.println(parentTconst);
        if(("\""+parentTconst).equals(id))
        {
            count++;
        }
      } 
      
      
      if(found)
      {
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
         System.out.println("Series is found. ");
         System.out.println("Name: " + serie);
         System.out.println("ID: " + id);
         System.out.println("Number Of Episodes: " + count);
         System.out.println("Genre: " + genre);
         System.out.println("+~~~~~~~~~~~~~~~~~~~~~~~~~");      
      }
      else
      {
         System.out.println(serie + " is not found! ");
      }
   
   
      return result;
   }
   
   public void searchLog (String search)
   throws FileNotFoundException
   {
       //åbner output fil
      //File f = new File("searchLog.txt");
     // PrintStream output = new PrintStream(f);
      
      PrintStream output = new PrintStream( new FileOutputStream("searchLog.txt", true)); 
      
      output.println(search); 
      
      output.close();
       //output.append(search); 
   
   }
      public void printLog(String text)
   {                    
      
      File f = new File("searchLog.txt");
      //Udskriv linie
      System.out.println(text);  
      
      //Scanner på linie
      Scanner linie = new Scanner(text);
      if (linie.hasNext()) 
      {
      String log = linie.next();
      System.out.println("Search log: " + log);
      }
   }
   
}