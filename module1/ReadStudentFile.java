package module1;
import java.io.*;

public class ReadStudentFile
{
      public static void readFile() throws IOException
      {
             FileInputStream fis=new FileInputStream("student");
             ObjectInputStream oips=new ObjectInputStream(fis);
             DetailsOfStudent d=null;
             try
             {
                      while((d=( DetailsOfStudent)oips.readObject())!=null)
                             System.out.println("\t"+d);
              }
              catch(Exception e)
              {
              }
                fis.close();
                 oips.close();
          }
}
