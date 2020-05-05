package module1;
import java.io.*;

public class DetailsOfStudent  implements Serializable
{
        //variables
        String studentname;
        String gender;
        int age;
      
        //parametorised constructor
         
        DetailsOfStudent(String studentname,String gender,int age)
         {
                this.studentname=studentname;
                this.gender=gender;
                this.age=age;
         }

         //display student details
         @Override
         public String toString()
          {
               return studentname+"\t\t"+gender+"\t\t"+age;
          }

          public static DetailsOfStudent getStudentDetails() throws IOException
          {
                DataInputStream dis=new DataInputStream(System.in);
                System.out.print("Enter student name:");
                String studentname=dis.readLine();
                System.out.print("Enter gender:");  
                String gender=dis.readLine();
                System.out.print("Enter age:"); 
                int age=Integer.parseInt(dis.readLine());
               
            
                //create DetailsOfStudent object
                DetailsOfStudent  x= new DetailsOfStudent(studentname,gender,age);
                return x;
              }
}
                