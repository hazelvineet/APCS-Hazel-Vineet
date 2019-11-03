import java.util.Scanner;

public class charAt
{
   public static void main(String[] args)
   {
      String input;
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      input = in.nextLine();
      
      for(int i = 0; i < input.length(); i++)  
      {  
         System.out.println(input.charAt(i));  
      }  
      
   }
}