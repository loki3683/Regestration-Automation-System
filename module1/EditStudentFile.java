package module1;
import java.io.*;
 
public class EditStudentFile
{    
    public static void modifyStudentDetail(DetailsOfStudent oldString,DetailsOfStudent newString)throws IOException
    {
          FileInputStream fis=new FileInputStream("student");
          ObjectInputStream ooip=new ObjectInputStream (fis);
        
          FileOutputStream fout=new FileOutputStream("student2");
          ObjectOutputStream  oop=new  ObjectOutputStream (fout);

          DetailsOfStudent x=null;
          try
          {
          while((x=(DetailsOfStudent)ooip.readObject())!=null)
           {
                  if(oldString.studentname.equals(x.studentname)&&oldString.gender.equals(x.gender)&&oldString.age==x.age)
                   {
                            oop.writeObject(newString);
                   }
                  else
                  {
                             oop.writeObject(x);
                   }
            }
             }
            catch(Exception e)
            {
            }
            fis.close();
            fout.close();
            ooip.close();
            oop.close();      
           FileInputStream fis1=new FileInputStream("student2");
           ObjectInputStream ooip1=new ObjectInputStream (fis1);
        
          FileOutputStream fout1=new FileOutputStream("student");
          ObjectOutputStream  oop1=new  ObjectOutputStream (fout1); 
          DetailsOfStudent x1=null;
          try
          {
            while((x1=(DetailsOfStudent)ooip1.readObject())!=null)
           {
                  oop1.writeObject(x1);
            }
           }
            catch(Exception e)
            {
            }
            fis1.close();
            fout1.close();
            ooip1.close();
            oop1.close();  
    }
  }