package module1;
import java.util.Random;
import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;
import java.io.File;

class Sec
{
      Scanner sc=new Scanner(System.in);
      void subjects()
    {
	System.out.println("The Subjects present in This Sem are:");
    	System.out.println("Discrere Mathematics");
                   System.out.println("Object Oriented Programming");
	System.out.println("Digital System Design");
	System.out.println("Skill for Engineering");
	System.out.println("Probability and Statistcs");
	System.out.println("Corporate Comunication Skills");
    }    
     void secAllotment()throws IOException
    {
	FileInputStream fis = null;
	DataInputStream dis = new DataInputStream(System.in);
	try
                  {
	        fis = new FileInputStream("FacultyDetails.txt");
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
	
                 }
	fis.close();	
    }
      String secNo()
      {
               System.out.println("SECTION NUMBER");
               String sec=sc.nextLine();
               return sec;
       }
 }

class timetable
{
	public static void main(String[] arr)throws IOException	
	{
                        int[][] a = new int[6][6];
                        String[] sarr= new String[10];
                        sarr[0]="DMS  ";
                        sarr[1]="OOP  ";
                        sarr[2]="DSD  ";
                        sarr[3]="SKILL";
                        sarr[4]="SE   ";
                        sarr[5]="PROB ";
                        sarr[6]="DS:LB";
                        sarr[7]="OOP:LB";
                        sarr[8]="DS:LB";
                        sarr[9]="CCS  ";
                        Scanner sc=new Scanner(System.in);
                        int[] c=new int[21];
                        for(int v=0;v<21;v++)
                        {
                                c[v]=0;
                         } 
                        while(true){
                                  int cases; 
					char[] animationChars = new char[]{'|', '/', '-', '\\'};

       				 for (int i = 0; i <= 100; i++) {
           			 System.out.print("Processing: " + i + "% " + animationChars[i % 4] + "\r");
				if(i%5==0||i%7==0){
            			try {
               			 Thread.sleep(100);
            			} catch (InterruptedException e) {
               			 e.printStackTrace();
           			 }}
        			}
			System.out.println("CHOOSE YOUR OPTION");
					System.out.println("1)SECTION AND FACULTY DETAILS");
					System.out.println("2)EXIT THE MODULE");
  					System.out.println("=======================================================================================");
                                  cases=sc.nextInt();
					for (int i = 0; i <= 100; i++) {
           			 System.out.print("Processing: " + i + "% " + animationChars[i % 4] + "\r");
				if(i%5==0||i%7==0){
            			try {
               			 Thread.sleep(100);
            			} catch (InterruptedException e) {
               			 e.printStackTrace();
           			 }}
        			}
					
                                  switch(cases){
                                               case 1:
                                                  FileReader fr=null;
                                                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                                                  System.out.println("enetr your section option");
                                                  Sec check=new Sec();
                                                  check.subjects();
                                                  check.secAllotment();
                                                  String fname=check.secNo();
                                                  int foo = Integer.parseInt(fname);
                                                  for(int i=0;i<6;i++)
                                                  {
                                                        for(int j=0;j<6;j++)
                                                        { 
                                                              Random rand = new Random(); 

                                                              int x= rand.nextInt(99);
                                                              a[i][j]=x;
                                                         }
                                                    }
                                                  if(c[foo]==0)
                                                  {
                                                               BufferedWriter output=null;
                                                               File fil=new File(fname);
                                                               output=new BufferedWriter(new FileWriter(fname,true));
                                                               int m=1;
                                                               for(int i=0;i<6;i++)
                                                                {
                                                                       for(int j=0;j<6;j++)
                                                                       {
                                                                              output.write(sarr[(a[i][j]%10)]+"  ");
                                                                       }
                                                                output.newLine();
                                                                 }
                                                                output.close();
                                                                c[foo]=1;
                                                                for(int i=0;i<6;i++)
                                                               {
                                                                       for(int j=0;j<6;j++)
                                                                       {
                                                                                     System.out.print(sarr[(a[i][j]%10)]+"  ");
                                                                         try{
				Thread.sleep(50);
			                }catch(InterruptedException ie){}
                                                                 } 
                                                                System.out.println();
                                                     } 

                                                      }
                                                     else
                                                    {
                                      FileInputStream fis = null;

		DataInputStream dis = new DataInputStream(System.in);

		try{
			fis = new FileInputStream(fname);
		}catch(FileNotFoundException fnf){
			System.out.println("File not found");
		}catch(NullPointerException npf){
			System.out.println("file error");
		}

		int n;

		while( (n=fis.read()) != -1 ){
			//before display convert unicode into char
			System.out.print((char)n);
			try{
				Thread.sleep(50);
			}catch(InterruptedException ie){}
		}

		fis.close();
                                      }
                                     break;
                                     case 2:
                                     System.out.println("THANK YOU ENJOY THE SEM");
                                    System.exit(0);
}
}
}
}
