/** Develop a class/struct for Token, must contain:
 String for lexeme representation, Int for token code part 1 of final */
import java.util.*;
 

public class Tokenstruct {
 
   
    public static void main(String args[])
    {
 
        
        System.out.println("struct for token  ");// using struct for token
 
        
        StringTokenizer st1 = new StringTokenizer(
            "lexueme representation", " ");// tokenizer class 
 
                while (st1.hasMoreTokens())
 
                 System.out.println(st1.nextToken());
                  int token1 = 10;     // int for token code
               boolean token2  = true; // Boolean to get int input
 
                System.out.println(token1); //confirm token1 = 10
                          
         
    }
}