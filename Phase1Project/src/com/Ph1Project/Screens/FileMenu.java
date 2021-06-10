package com.Ph1Project.Screens;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FileMenu implements Screens
{

	Scanner sc = new Scanner(System.in);

	int option;
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
		System.out.println("File Operations menu:");
		System.out.println("----------------------");
		
		for (String str : al)
		{
			System.out.println(str);
			
		}
		
	}

	@Override
	public void OptionMenu() 
	{
		System.out.println("Enter the option which you would like to perform:");
		option =sc.nextInt();
		
			switch(this.option)
			{
			case 1: //add files
				this.addfile(dir);
				this.show();
				break;
				
			case 2: //delete file
				this.deletefile(dir);
				this.show();
				break;
				
			case 3: //search file
				this.searchfile(dir);
				this.show();
				break;
				
			case 4 : //return to main menu
				MainMenu mm = new MainMenu();
				mm.show();
				mm.OptionMenu();
				break;
				
			default:
                System.out.println("Invalid option, please try again...");
                break;
			}
		this.OptionMenu();
	}
	
	
	public void addfile(String dir)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File name to be added:");
		String fname = sc.next();
		boolean result;
		File f1 = new File(dir,fname);
		try {
			result = f1.createNewFile();
			if(result)
			{
				System.out.println("File is successfully added to directory!!! ");
			}
			else
			{
				System.out.println("Same named file is already present...");
			}
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------------");
	}
	
	
	public void deletefile(String dir)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the File name to be deleted:");
		String fname = sc.next();
		boolean result;
		File f2 = new File(dir,fname);
		try {
			result = f2.delete();
			if(result)
			{
				System.out.println("File is successfully deleted from directory!!! ");
			}
			else
			{
				System.out.println("Entered File is not present in directory to delete...");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("--------------------------------------------------------");
	}
	
	public void searchfile(String dir)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter File name to be search:");
		String fname = sc.next();
		boolean result;
		File f1 = new File(dir,fname);
		try {
			result = f1.exists();
			if(result)
			{
				System.out.println("Entered file name " +fname+ " found in directory!!! ");
			}
			else
			{
				System.out.println("Entered File is not found in directory...");
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("---------------------------------------------------");
	}
	
}



