// Vincenzo Scotto Di Uccio algwrkbnch
import java.io.*;
public class fileVSDU
{
   public static void main(String[] args) throws IOException
   {
      PrintWriter outputFile = new PrintWriter("NumberList.text");
      
      for(int i=1; i <=100; i++)
         outputFile.println(i);
      outputFile.close();
   }
}