import java.util.*;  
import java.io.*;  
  
public class PascalToJava {  
   public static void main(String[] args) throws Exception {  
      Scanner in = new Scanner(new File("pascal.txt"));  
      String regex = ":="; 
     
      while (in.hasNextLine()) {  
         String line = in.nextLine();  
         line = line.replaceAll(regex, "=");
         System.out.println(line);  
      }  
   }  
}  