package com.builder;

public class PhoneBuilder {
	
	String operatingSystem;
	int RAM;
	String processor;
	double screenSize;
	

	@Override
	public String toString() {
		return "PhoneBuilder [operatingSystem=" + operatingSystem + ", RAM=" + RAM + ", processor=" + processor
				+ ", screenSize=" + screenSize + "]";
	}
	public PhoneBuilder setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
		return this;
	}
	public PhoneBuilder setRAM(int rAM) {
		RAM = rAM;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		
		return this;
	}
	
	public Phone build()
	{
		return new Phone(operatingSystem, RAM, processor, screenSize);
		
	}
	
	
	
	
	
	
	
	
	

}
