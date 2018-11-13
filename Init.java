//Linebaseret processing
import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Init
{
   
   public static void main (String[] args)
      throws FileNotFoundException
   {
      FileDataHandler fdh = new FileDataHandler();
      //Adminstrator logon = new Adminstrator();
      Menu mainMenu = new Menu();
      
      
      fdh.startFileHandling();
      //logon.logon();
      mainMenu.StartMenu();
   }
}