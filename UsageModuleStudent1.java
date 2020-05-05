import module1.DetailsOfStudent;
import module1.DeleteStudentData;
import module1.EditStudentFile;
import module1.ReadStudentFile;
import java.io.*;
import java.util.*;

class UsageModuleStudent1
{
       public static void main(String args[])throws IOException
       {
               Scanner sc=new Scanner(System.in);
		System.out.println("***************MENU***************");
               System.out.println("Enter the choice :");
               System.out.println("1.Store Student Details");
               System.out.println("2.Edit Student Details");
               System.out.println("3.Delete Student Details");
               System.out.println("4.Report of Student Details");
               int choice=sc.nextInt();
               int num;
               System.out.println("Enter how many Students");
                            num=sc.nextInt();
		label:while(true)
               {
                try{
               switch(choice)
               {
                     case 1:
                             
                            FileOutputStream fout=new FileOutputStream("student");
                            ObjectOutputStream oops=new ObjectOutputStream(fout);
                            
                            DetailsOfStudent x=null;
                            for(int i=0;i<num;i++)
                            {
                                  x=DetailsOfStudent.getStudentDetails();
                                  oops.writeObject(x);
                            }
                            break;
                      case 2:
                             System.out.println("Enter the previous details you have given");
                             DetailsOfStudent newcontent=null;
                             DetailsOfStudent oldcontent=null;

                             oldcontent=DetailsOfStudent.getStudentDetails();
                             System.out.println("Enter the new details you have  to give");
                             newcontent=DetailsOfStudent.getStudentDetails();

                             EditStudentFile.modifyStudentDetail(oldcontent,newcontent);
                             

                             break;
                     case 3:   System.out.println("Enter the details you have to delete");
                              DetailsOfStudent deletecontent=null;
	           deletecontent=DetailsOfStudent.getStudentDetails();

                             DeleteStudentData.modifyStudentDetail(deletecontent);
                             break;
                      case 4:	System.out.println("------------------------*****------------------------");
				ReadStudentFile.readFile();
				System.out.println("------------------------*****------------------------");
                              break;
                      default:System.out.println("enter valid option");
 			break label;
                     }
                     }
                    
                      catch(InputMismatchException e)
                      {}
                       System.out.println("Enter the choice :");
                      choice=sc.nextInt();
                   }
                   while(num!=0)
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
                                                  
                                                 System.out.println("The Subjects present in This Sem are:");
    	System.out.println("Discrere Mathematics");
                   System.out.println("Object Oriented Programming");
	System.out.println("Digital System Design");
	System.out.println("Skill for Engineering");
	System.out.println("Probability and Statistcs");
	System.out.println("Corporate Comunication Skills");
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

	int n1;
	while( (n1=fis.read()) != -1 ){
	//before display convert unicode into char
	System.out.print((char)n1);
	try{
                        Thread.sleep(50);
	}
                  catch(InterruptedException ie){}
                 }
	fis.close();	
                    System.out.println("");
	System.out.println("Enter the Section u want to choose:");
                                                  String fname=br.readLine();
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
                                     
		try{
			fis = new FileInputStream(fname);
		}catch(FileNotFoundException fnf){
			System.out.println("File not found");
		}catch(NullPointerException npf){
			System.out.println("file error");
		}

		int n11;

		while( (n11=fis.read()) != -1 ){
			//before display convert unicode into char
			System.out.print((char)n11);
			try{
				Thread.sleep(50);
			}catch(InterruptedException ie){}
		}

		fis.close();
                                      }
                                     System.out.println("THANK YOU ENJOY THE SEM");                                   
                                      num--;
                                      break;
	                   case 2:
                                              System.exit(0);
                                              break;
                                }
}
}
                  
                 
        }
}
