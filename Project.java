package com.simplilearn.multithread;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Project {
	public static void add() throws IOException
	 {
		 System.out.println("Enter your file name");
		 Scanner s1 = new Scanner(System.in);
		 String d1 = s1.nextLine();
		 
		 File f1 = new File("D:\\FileHandling\\"+d1);
		 
		 if(f1.createNewFile())
			 System.out.println("File is created");
		 else
			 System.out.println("File is alredy exist");
		 FileWriter writer = new FileWriter(f1,true);
		 writer.write("\nWrite your content here");
		 writer.close();
	 }
	 
	 
	 
	 public static void delete()
	 {
		 System.out.println("Enter file name for delete ex:- abc.txt");
		 Scanner s2 = new Scanner(System.in);
		 String d2 = s2.nextLine();
	      
		 File f2 = new File("D:\\FileHandling\\"+d2);	
		 
		 if(f2.delete())
			 System.out.println("File is deleted");
		 else
			 System.out.println("File is not deleted or file is not found");
	 }
	 
	 
	 
	 public static void search()
	 {
		 System.out.println("Enter your file name to search");
		 Scanner s3 = new Scanner(System.in);
		 String d3 = null;
		 d3 = s3.nextLine();
		 File f3 = new File("D:\\FileHandling\\"+d3);
		 if( f3.exists())
		 {
			System.out.println("File is available"); 
		 }
		 else 
			 System.out.println("File is not available");
	 }
	 
	 
	 
	 public static void accendingorder()
	 {
		
			
			File kiku = new File("D:\\FileHandling\\");
		    if(kiku.isDirectory())
		    {
		      //Fetching file from the directory
		      File[] files = kiku.listFiles();

		      System.out.println("All the files including folders");
		      System.out.println("@@@@@--------------------------------@@@@@");
		   
		   

		      // sort files by name
		      Arrays.sort(files, new Comparator()
		      {
		        @Override
		        public int compare(Object f1, Object f2) {
		          return ((File) f1).getName().compareTo(((File) f2).getName());
		        }
		      });

		      //Print file name in acceding order.
		      for(File file:files)
		      {
		        System.out.println(file.getName());
		      }
		      System.out.println("\nAfter sorting by name");
		      System.out.println("!!!!---------------------------------!!!!");

		      // This is through Sort files by size.
		      Arrays.sort(files, new Comparator()
		      {
		        @Override
		        public int compare(Object f1, Object f2)
		        {
		          if (((File) f1).length() < ((File) f2).length())
		          {
		            return -1;
		          }
		          else if (((File) f1).length() > ((File) f2).length())
		          {
		            return 1;
		          }
		          else
		          {
		            return 0;
		          }
		        }
		      });

		      //Prints files according to  file size
		      for(File file:files)
		      {
		        System.out.println(file.getName());
		      }
		      System.out.println("\nAfter sorting by length");
		      System.out.println("<<<------------------------------->>>");

		      
		      for(File file:files)
		      {
		        System.out.println(file.getName());
		      }
		      System.out.println("-------------------------");
		      System.out.println("-------------------------");
		    }
			
	 }
	 

	 public static void main(String[] args) throws IOException {
		 System.out.println("************************Welcome to lookedme.com************************");
		 System.out.println("Aplicataion name : Virtual Key Repository");
		 System.out.println("************************Devloper details**************************");
		 System.out.println("Name : Dhiraj Kumar");
		 System.out.println("Designation : Trainee");
		 System.out.println("Date : 11/05/2022 \n");
			
			while(true)
			{
				System.out.println("Enter 1 : Get files name in acceding order");
				System.out.println("Enter 2:  For Business Operation                                                                                                                                                                                                                                                                                                                or Business Operation");
				System.out.println("Enter 3: Close the Application");

				System.out.println("Enter your choice");
				
				Scanner v = new Scanner(System.in);
				
				int option= v.nextInt();

				if(option==1)
				{
					accendingorder();
				}

				else if(option ==2)
				{
					System.out.println("\n--->Select Any one to perform business levele operations");
					System.out.println("\nEnter 1 : add file");
					System.out.println("Enter 2:  delete file");
					System.out.println("Enter 3:  search file");
					System.out.println("Enter 4:  go back");
					
					System.out.println("Enter your choice :- ");
					
					int input = v.nextInt();
					
					switch(input)
					{
					
					case 1: {	add();  break;  }
						
				    case 2: { delete(); break;  }
					
					case 3: { search(); break;  }
					
					case 4: {  System.out.println("Back is Successful"); break;  }
						   
			     }
			 }
				
				else if(option == 3 )	
				{ 	 System.out.println(" Exit ");	
				      System.exit(option); 
				}
				
				else
				{
					System.out.println("Kindly enter valid input");
				}
	}
					
	}
		}

