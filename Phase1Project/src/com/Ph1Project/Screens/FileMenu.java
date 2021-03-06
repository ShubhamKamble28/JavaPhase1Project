package com.Ph1Project.Screens;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileMenu implements Screens
{

	Scanner sc = new Scanner(System.in);
	int option,con;
	String dir = "D:\\Simplilearn Course Material\\Phase1 Project\\Directory";
	List<String> al = new ArrayList<String>();
	
	public FileMenu()
	{
		al.add("1.Add file");
		al.add("2.Delete file");
		al.add("3.Search file");
		al.add("4.Return to main menu");
	
	}
	@Override
	public void show() 
	{
		System.out.println("File Option menu:");
		
		for (String str : al)
		{
			System.out.println(str);
			
		}
		
	}

	@Override
	public void OptionMenu() 
	{
		System.out.println("Enter the option:");
		option =sc.nextInt();
		
			switch(option)
			{
			case 1: //add files
				//System.out.println("Name of file to be add:");
				this.addfile(dir);
				
				break;
			case 2: //delete file
				//System.out.println("Name of file to be delete:");
				this.deletefile(dir);
				
				break;
			case 3: //search file
				//System.out.println("Name of file to be search:");
				this.searchfile(dir);
				
				break;
			case 4 : //return to main menu
				MainMenu mm = new MainMenu();
				mm.show();
				mm.OptionMenu();
				break;
			default:
                System.out.println("Invalid option, please try again");
                break;
			}
		
	}

	@Override
	public void GetUserInput() 
	{	}
	
	
	
	public void addfile(String dir)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("file name to be added:");
		String fname = sc.next();
		boolean result;
		File f1 = new File(dir,fname);
		try {
			result = f1.createNewFile();
			if(result)
			{
				System.out.println("file added to directory ");
			}
			else
			{
				System.out.println("already present");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("----------------------------------");
	}
	
	
	public void deletefile(String dir)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("file name to be deleted:");
		String fname = sc.next();
		boolean result;
		File f2 = new File(dir,fname);
		try {
			result = f2.delete();
			if(result)
			{
				System.out.println("file deleted from directory ");
			}
			else
			{
				System.out.println("file not in directory");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("----------------------------------");
	}
	
	public void searchfile(String dir)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("file name to be search:");
		String fname = sc.next();
		boolean result;
		File f1 = new File(dir,fname);
		try {
			result = f1.exists();
			if(result)
			{
				System.out.println("file found in directory " +fname);
			}
			else
			{
				System.out.println("file not found");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("----------------------------------");
	}
	
}



