package abstrat.factory.design.pattern;

public class ComputerClient {

public static void main(String[] args) {
	
	Computer PC = ComputerFactory.createComputer(new PCFactory("500", "4", "intel"));
	
	System.out.println(PC.toString());
	
	Computer server = ComputerFactory.createComputer(new ServerFactory("2TB", "100TB", "I7 core to Duo"));
	
	System.out.println(server.toString());
	
	
}


}
