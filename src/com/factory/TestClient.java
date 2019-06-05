package com.factory;

import com.dp.OS;

public class TestClient {

	public static void main(String[] args) {
		
		OS osInstance = OperatingSystemFactory.getOSInstance();
		
		osInstance.specification();
		
	}
	
	
	
}
