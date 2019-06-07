package design.pattern.singleton;

public class Employee
{
	public static Employee e1 = new Employee();

	private Employee()
	{
		System.out.println("creating Instance");
	}
	
	
	public static Employee getSingleToneInstance()
	{
		return e1;
	}
	

}