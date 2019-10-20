//enter a name: Ravi
//output: RRRRaaaavvvviiii

import java.util.Scanner;

public class NameLength
{
   public static void main(String[] args)
   {
   
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first name here");
      String name = in.nextLine();
      String newName = "";
      int length = name.length();
      
      for(int i = 0; i < name.length(); i++ )
      {
         
         for(int k = 0; k < name.length(); k++)
         {
            newName = newName + name.charAt(i);
         }
         
      }
      System.out.println(newName);
   } 
}