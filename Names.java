//create an array of 10 people that you know, first and last name
//from two arrays, split into 2, first name, and last name
// print both arrays as if you are printing the first array
import java.io.*;

public class Names
{
   public static void main(String[] args)
   {
      String[] names = {"John Johnny", "Bob Bobby", "Carl Carly", "Smith Smithens", "Jackie Jack", "Robbie Rob", "Ruth Ruthens", "Charlie Charles", "Maxine Max", "Sam Samuels"};
      String[] first = new String[10];
      String[] last = new String[10];
            
      for(int i = 0; i < names.length; i++)
      {
         first[i] = names[i].substring(0, names[i].indexOf(" "));
         last[i] = names[i].substring(names[i].indexOf(" ")+1);
         System.out.println(first[i] + " " + last[i]);
      }
   }
}