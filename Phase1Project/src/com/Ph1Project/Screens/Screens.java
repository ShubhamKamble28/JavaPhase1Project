package com.Ph1Project.Screens;

public interface Screens 
{
	public void show();
	
	public void OptionMenu();
	
	public default void screenshow()
	{
		String appName = "Virtual Key Company Lockers Pvt. Ltd.";
		String devName = "Developed by Shubham Kamble";
		
		System.out.println(appName);
		System.out.println();

		System.out.println(devName);
		System.out.println();
		
		System.out.println("Welcome to the Application!!!");
		System.out.println("--------------------------------------");
	}

}
