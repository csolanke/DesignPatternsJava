package abstrat.factory.design.pattern;

public class Server implements Computer {
	
	private String RAM;
	private String HDD;
	private String CPU;
	
	@Override
	public String toString() {
		return "Server [RAM=" + RAM + ", HDD=" + HDD + ", CPU=" + CPU + "]";
	}

	public Server(String rAM, String hDD, String cPU) {
		super();
		RAM = rAM;
		HDD = hDD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}

}
