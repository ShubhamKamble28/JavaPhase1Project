package com.Ph1Project.Screens;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainMenu implements Screens
{

	
	int option;
	Scanner sc = new Scanner(System.in);
	
	
	FileMenu fm = new FileMenu();
	List<String> alm = new ArrayList<>();
	
	public MainMenu()
	{
		String appName = "Virtual Key App";
		String devName = "Developed by Shubham Kamble";
		
		System.out.println(appName);
		System.out.println();

		System.out.println(devName);
		System.out.println();
		
		alm.add("1.Show files");
		alm.add("2.Show files option Menu");
		alm.add("3.Quit");
		
		
	}
	
	@Override
	public void show() 
	{
		System.out.println("Main Menu of the Application");
		System.out.println("-----------------------------------");
		for (String str1 : alm) 
		{
			System.out.println(str1);
		}
		
	}

	@Override
	public void OptionMenu()
	{
		
		System.out.println("Enter the option:");
		option =sc.nextInt();
		
			switch(option)
			{
			case 1: //show files
				System.out.println("List of files:");
				this.showfile(fm.dir);
				this.show();
				this.OptionMenu();
				break; 
			case 2: //file menu
				//FileMenu fm = new FileMenu();
				fm.show();
				fm.OptionMenu();
				break;
			case 3: //Quit
				System.out.println("Thanks for using the application");
				System.exit(0);
				
			default:
                System.out.println("Invalid option, please try again");
                break;
			}
		this.OptionMenu();
	}

	@Override
	public void GetUserInput() 
	{
		
	}
	
	public void showfile(String dir)
	{
		
		File f = new File(dir);
		
		String list[] = f.list();
		for (String string : list) 
		{
			System.out.println(string);
			
		}
		
	}
	

}
