import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**) Develop a Compiler Class that
a. Has a method that takes in an INPUT FILE and converts it to one input str part 2 of final
   */
public class ComplierClassFile
{
   public static void main(String[] args) throws FileNotFoundException
   {
      // Prompt for the input and output file names

      Scanner console = new Scanner(System.in);
      System.out.print("Input file: ");
      String inputFileName = console.next();
      System.out.print("Output file: ");
      String outputFileName = console.next();

      // Construct the Scanner converts the input file

      File inputFile = new File(inputFileName);
      Scanner in = new Scanner(inputFile);
      PrintWriter out = new PrintWriter(outputFileName);

      // Read the input and write the output
      
      int i = 1;
      
      

      while (in.hasNextLine())
      {
         String line = in.nextLine();
         out.println("/*" + i + "*/" + line);
         i++;
        
       }

      in.close();
      out.close();
      
      // reopen the output file for input - the display its contents
      in = new Scanner ( new File(outputFileName));
      while (in.hasNextLine())
      {
         String line = in.nextLine();
         System.out.println(line);
      }
   }
}