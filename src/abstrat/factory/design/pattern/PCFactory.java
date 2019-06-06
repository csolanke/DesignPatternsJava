package abstrat.factory.design.pattern;

public class PCFactory implements ComputerAbstractFactory{

	@Override
	public Computer createComputer() {
		return new PC(this.RAM, this.HDD, this.CPU);
	}
	
	
	private String HDD;
	private String RAM;
	private String CPU;
	
	public PCFactory(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}
	
	

}
