//Linebaseret processing
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Episode
{
   //Attributes
  public String parentTconst;
  public String tconst;
   
   //Getter
   public String getParentTconst()
   {
      return parentTconst;
   }
   public String gettconst()
   {
      return tconst;
   }
   
   //konstrukt�r
   public Episode()
   {
      this.parentTconst = "";
      this.tconst = "";
   }


   //Konstrukt�r
   public Episode(String parentTconst_p, String tconst_p)
   {
      this.parentTconst = parentTconst_p;
      this.tconst = tconst_p;
   }
}