import java.util.Scanner;

public class NameEcho
{
   public static void main(String[] args)
   {
      String name;
      
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first and last name");
      name = in.nextLine();
      
      
      String first = name.substring(0, name.indexOf(" "));  
      String last = name.substring(name.indexOf(" ") + 1);  
      
      System.out.println(first + " " + last.toUpperCase());
   }
}