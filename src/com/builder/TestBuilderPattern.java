package com.builder;

public class TestBuilderPattern {
	
	public static void main(String[] args) {
		
		Phone ph1 = new Phone("android", 2, "intel", 6.5);

		System.out.println(ph1);
		
		PhoneBuilder builder = new PhoneBuilder();
		Phone ph2 = builder.setOperatingSystem("IOS").setScreenSize(4.0).build();
		
		
		System.out.println(ph2);
		
		
		
		
	}
	
	

}
