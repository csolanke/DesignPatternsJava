package design.pattern.singleton;

public class TestSingleTone {
	
	public static void main(String[] args) {
		
		
		Employee singleToneInstance2 = Employee.getSingleToneInstance();
		Employee singleToneInstance =Employee.getSingleToneInstance();
		
		System.out.println(singleToneInstance);
		System.out.println(singleToneInstance2);
		
		
	}

}
