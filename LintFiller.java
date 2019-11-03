import java.io.*;  
import java.util.*;  
  
public class LintFiller {  
   public static void main(String[] args) throws Exception {  
      Scanner in = new Scanner(new File("lint.txt"));  
      while (in.hasNextLine()) {   
         String newLine = in.nextLine();  
         if (newLine.trim().startsWith("if") || newLine.trim().startsWith("while")){  
            if (newLine.indexOf("=")>-1) {  
               if (checkSingleEquals(newLine))  
                  System.out.println(newLine);  
            }  
         }  
      }  
   }  
     
   public static boolean checkSingleEquals(String newLine) {  
      int equals = newLine.indexOf("=");  
      String prefixes = "!<>";  
      if (newLine.charAt(equals-1)==' ' && newLine.charAt(equals+1)==' ')  
         return true; 
    
      if (newLine.charAt(equals+1)=='=')  
         return false;  
 
      String charBeforeEquals = "" + newLine.charAt(equals-1);   
      if (prefixes.contains(charBeforeEquals))  
         return false;                          
      return true;  
   }  
}  