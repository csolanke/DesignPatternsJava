package abstrat.factory.design.pattern;

public class ComputerFactory {
	
	public static Computer createComputer(ComputerAbstractFactory caf)
	{
		return caf.createComputer();
	}
	
	

}
