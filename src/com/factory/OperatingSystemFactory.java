package com.factory;

import java.util.Scanner;

import com.dp.Android;
import com.dp.IOS;
import com.dp.OS;
import com.dp.Windows;

public class OperatingSystemFactory {
	
	private OperatingSystemFactory()
	{}
	
	public static OS getOSInstance()
	{
		String type = null;
		Scanner sc = new Scanner(System.in);
		
		 if(sc.hasNextLine())
		 {
			 type = sc.nextLine();
		 }
		 
		 if(type.equals("IOS"))
		 {
			return new IOS();
		 }
		 else if(type.equals("Android"))
		 {
			 return  new Android();
		 }
		 
		 else return new Windows();
		
	}

}
