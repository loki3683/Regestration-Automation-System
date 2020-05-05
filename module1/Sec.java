package module1;
import java.util.*;
import java.io.*;

class Sec
{
      Scanner sc=new Scanner(System.in);
      void Subjects()
    {
	System.out.println("The Subjects present in This Sem are:");
    	System.out.println("Discrere Mathematics");
                   System.out.println("Object Oriented Programming");
	System.out.println("Digital System Design");
	System.out.println("Skill for Engineering");
	System.out.println("Probability and Statistcs");
	System.out.println("Corporate Comunication Skills");
    }    
     void SecAllotment()throws IOException
    {
	FileInputStream fis = null;
	DataInputStream dis = new DataInputStream(System.in);
	try
                  {
	        fis = new FileInputStream("FacultyDetails");
	}
                   catch(FileNotFoundException fnf)
                  {
                            System.out.println("File not found");
	}
                  catch(NullPointerException npf)
                  {
	         System.out.println("file error");
	}

	int n;
	while( (n=fis.read()) != -1 ){
	//before display convert unicode into char
	System.out.print((char)n);
	try{
                        Thread.sleep(50);
	}
                  catch(InterruptedException ie){}
                 }
	fis.close();	
    }
      int secNo()
      {
               System.out.println("Enter the section number you have to choose:");
               int sec=sc.nextInt();
               return sec;
       }
 }