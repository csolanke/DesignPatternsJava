package com.builder;

public class Phone {  
	
	String operatingSystem;
	int RAM;
	String processor;
	double screenSize;
	
	
	public Phone(String operatingSystem, int rAM, String processor, double screenSize) {
		super();
		this.operatingSystem = operatingSystem;
		RAM = rAM;
		this.processor = processor;
		this.screenSize = screenSize;
	}


	@Override
	public String toString() {
		return "Phone [operatingSystem=" + operatingSystem + ", RAM=" + RAM + ", processor=" + processor
				+ ", screenSize=" + screenSize + "]";
	}


	public String getOperatingSystem() {
		return operatingSystem;
	}


	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}


	public int getRAM() {
		return RAM;
	}


	public void setRAM(int rAM) {
		RAM = rAM;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public double getScreenSize() {
		return screenSize;
	}


	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
	
	

}
